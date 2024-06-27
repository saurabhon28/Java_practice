package com.practice_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdemo {
     public static void main(String[] args) {
    	 //get , load
    	// factory object are used to save the data to the database
 		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
 		
 		Session session = factory.openSession();
 		//get - student: with id 2
 		 Student student = session.get(Student.class, 3);
 		 
 		System.out.println(student);
 		
 		Student student2 = session.load(Student.class, 1);
 		System.out.println(student2);
 		
 		factory.close();
     }
}
