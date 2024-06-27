package com.user_management.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.user_management.dao.UserDAO;
import com.user_management.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDAO userDao; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        
    }

	
	public void init() throws ServletException {
		userDao = new UserDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		
		switch(action)
		{
		case "/new":
			showNewForm(request, response);
			break;
		case "/insert":
			try {
				insertUser(request, response);
			} catch (ServletException | SQLException | IOException e) {
				e.printStackTrace();
			}
			break;
		case "/delete":
			try {
				deleteUser(request, response);
			} catch (ServletException | SQLException | IOException e) {
				e.printStackTrace();
			}
			break;
		case "/edit":
			try {
				showEditForm(request, response);
			} catch (ServletException | SQLException | IOException e) {
				e.printStackTrace();
			}
			break;
		case "/update":
			try {
				updateUser(request, response);
			} catch (ServletException | SQLException | IOException e) {
				e.printStackTrace();
			}
			break;
		default:
			try {
				listUser(request, response);
			} catch (ServletException | SQLException | IOException e) {
				e.printStackTrace();
			}
			break;
		}
	
}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		 dispatcher.forward(request, response);
	}
	 //Insert user
	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException 
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(name, email, country ); 
		
		try {
			userDao.insertUser(newUser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("list");
	}
	
	//Delete user
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException
	{
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			userDao.deleteUser(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Edit user
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws ServletException, SQLException, IOException
	{
		int id = Integer.parseInt(request.getParameter("id"));
		
		User existingUser;
		try {
			existingUser = userDao.selectUser(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
			request.setAttribute("user", existingUser);
			 dispatcher.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Update user
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("id");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		User user = new User(id, name, email, country);
		userDao.updateUser(user);
		response.sendRedirect("list");
		
	}
	
	//Default
	private void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException
	{
		try {
			List<User> listUser = userDao.selectAllUsers();
			request.setAttribute("listUser", listUser);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
			dispatcher.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
