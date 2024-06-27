package com.practice_hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project started.....");

		// factory object are used to save the data to the database
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
          
	//Creating student
	
	  Student stu = new Student(); stu.setId(3); stu.setName("Arjun");
	  stu.setCity("Kolkata");
	 
		
		
	//Creating Address object class
		Address add = new Address();
		add.setStreet("Street1");
		add.setCity("Ranchi");
		add.setOpen(true);
		add.setAddedDate(new Date());
		add.setX(1234.456);
		
		
		// Reading image
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("src/main/java/pic.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		add.setImage(data);
		
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		
		session.beginTransaction();
		
		session.save(stu);
		session.save(add);
		
		transaction.commit();
		
		session.close();
        System.out.println("Done...");
		
	}
}
