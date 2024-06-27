package com.practice_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
   public static void main(String[] args) {
	
	// factory object are used to save the data to the database
	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	 
	 Student student1 = new Student();
	 student1.setId(1234);
	 student1.setName("Saurabh Dubey");
	 student1.setCity("Ranchi");
	 
	 Certificate certificate1 = new Certificate();
	 certificate1.setCourse("Java");
	 certificate1.setDuration("3 months");
	 
	 student1.setCerti(certificate1);
	 
	 Student student2 = new Student();
	 student2.setId(1235);
	 student2.setName("Pankaj Kumar");
	 student2.setCity("Chandigarh");
	 
	 Certificate certificate2 = new Certificate();
	 certificate2.setCourse("JavaScript");
	 certificate2.setDuration("2 months");
	 
	 student2.setCerti(certificate2);
	 
	 Session session = factory.openSession();
	 Transaction transaction = session.beginTransaction();
	 
	 session.save(student1);
	 session.save(student2);
	 
	 transaction.commit();
	 session.close();
	 factory.close();
}
}
