package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	 public static void main(String[] args) {
		// factory object to save the data to the database
	        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	        //Creating Employee
	        Employee emp1 = new Employee();
	        Employee emp2 = new Employee();
	        
	        emp1.setEid(111);
	        emp1.setEmpName("Karan");
	        
	        emp2.setEid(114);
	        emp2.setEmpName("Arjun");
	        
	        //Creating Projects
	        Project proj1 = new Project();
	        Project proj2 = new Project();
	        
	        proj1.setPid(21321);
	        proj1.setProjectName("Student Management");
	        
	        proj2.setPid(21225);
	        proj2.setProjectName("Chatbot");
	        
	        List<Employee> listEmp = new ArrayList<Employee>();
	        List<Project> listProj = new ArrayList<Project>();
	        
	        listEmp.add(emp1);
	        listEmp.add(emp2);
	        
	        listProj.add(proj1);
	        listProj.add(proj2);
	        
	        emp1.setProjects(listProj);
	        proj2.setEmployees(listEmp);
	        
	        
	        //Session
	        Session session = factory.openSession();
	        Transaction transaction = session.beginTransaction();
	        
	        session.save(emp1);
	        session.save(emp2);
	        session.save(proj1);
	        session.save(proj2);
	        
	        
	        transaction.commit();
	        
	        
	        
	        session.close();
	        factory.close();

	}
}
