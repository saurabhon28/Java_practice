package com.user_management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.user_management.model.User;

public class UserDAO {
  private String jdbcURL = "jdbc:mysql://localhost:3306/user_management";
  private String user = "root";
  private String password = "Babu@2803";
  private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
  
  private static final String INSERT_USER_SQL = "INSERT INTO user (name, email, country) VALUES (?,?,?)";
  private static final String SELECT_USER_BY_ID = "SELECT id, name, email, country from user where id=?";
  private static final String SELECT_ALL_USERS = "SELECT * from user";
  private static final String DELETE_USER_SQL = "delete from user where id=?;";
  private static final String UPDATE_USER_SQL = "update user set name=?,email=?,country=? where id=?;";

  public UserDAO() {
	
  }
  
  protected Connection getConnection() {
	  Connection connection = null;
	  try {
		  Class.forName(jdbcDriver);
		  connection = DriverManager.getConnection(jdbcURL,user,password);
		  if(connection != null) {
			  System.out.println("Database connected");
		  }else {
			  System.out.println("Database not connected"); 
		  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  } catch(ClassNotFoundException e) {
		  e.printStackTrace();
	  }
	  
	  return connection;
  }
  
//  insert user
  
  public void insertUser(User user) throws SQLException {
	  System.out.println(INSERT_USER_SQL);
	  try(Connection connection = getConnection();
			  PreparedStatement ps = connection.prepareStatement(INSERT_USER_SQL)){
		  ps.setString(1, user.getName());
		  ps.setString(2, user.getEmail());
		  ps.setString(3, user.getCountry());
		  System.out.println(ps);
		  ps.executeUpdate();
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
  }
//  select user by id
  public User selectUser(int id) throws SQLException {
	  User user = null;
	  //Establishing a connection
	  try(Connection connection = getConnection();
			PreparedStatement ps = connection.prepareStatement(SELECT_USER_BY_ID);){
		  System.out.println(SELECT_USER_BY_ID);
	 //Execute the query and update query
		  ResultSet rs = ps.executeQuery();
		  
		  while(rs.next()) {
			  String name = rs.getString("name");
			  String email = rs.getString("email");
			  String country = rs.getString("country");
			  user = new User(id, name, email, country);
		  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
	  return user;
  }
//  select all user 
  public List<User> selectAllUsers() throws SQLException{
	  List<User> users = new ArrayList<>();
	  try(Connection connection = getConnection();
			  PreparedStatement ps = connection.prepareStatement(SELECT_ALL_USERS);){
		  System.out.println(SELECT_ALL_USERS);
		  ResultSet rs = ps.executeQuery();
		  
		  while(rs.next()) {
			  int id = rs.getInt("id");
			  String name = rs.getString("name");
			  String email = rs.getString("email");
			  String country = rs.getString("country");
			  users.add(new User(id, name, email,country));
		  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
	  return users;
  }
//  update user
  public boolean updateUser(User user) throws SQLException {
	  boolean rowUpdated;
	  try(Connection connection = getConnection();
			 PreparedStatement ps = connection.prepareStatement(UPDATE_USER_SQL);){
		       System.out.println("Updated user: "+ ps);
		         ps.setString(1, user.getName());
		         ps.setString(2, user.getEmail());
		         ps.setString(3, user.getCountry());
		         ps.setInt(4, user.getId());
		         
		         rowUpdated = ps.executeUpdate() > 0;
	  }
	  return rowUpdated;
  }
//  delete user
  public boolean deleteUser(int id) throws SQLException {
	  boolean rowDeleted;
	  try(Connection connection = getConnection();
			  PreparedStatement ps = connection.prepareStatement(DELETE_USER_SQL);){
		      ps.setInt(1, id);
		  rowDeleted = ps.executeUpdate() > 0;
	  } 
	  return rowDeleted;
  }
}
