package com.map;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

    public static void main(String[] args) {

        // factory object to save the data to the database
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Creating Question
//        Question q1 = new Question();
//        q1.setId(101);
//        q1.setQuestion("What is Java ?");
//
//        // Creating Answer
//        Answer ans1 = new Answer();
//        ans1.setId(201);
//        ans1.setAnswer("Java is a programming language...");
//        ans1.setQuestion(q1);
//        
//        Answer ans2 = new Answer();
//        ans2.setId(202);
//        ans2.setAnswer("With using java we can create softwares.....");
//        ans2.setQuestion(q1);
//
//        Answer ans3 = new Answer();
//        ans3.setId(203);
//        ans3.setAnswer("We can use java for RestAPIs.....");
//        ans3.setQuestion(q1);
//        
//        List<Answer> list = new ArrayList<Answer>();
//        list.add(ans1);
//        list.add(ans2);
//        list.add(ans3);
//        
//        q1.setAnswer(list);
        
        //Session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // save session
//        session.save(q1);
//        session.save(ans1);
//        session.save(ans2);
//        session.save(ans3);
        
        
        Question q = session.get(Question.class, 101);
        System.out.println(q.getQuestion());
        
        for(Answer ans:q.getAnswers()) {
        	System.out.println(ans.getAnswer());
        }
        
        transaction.commit();

        session.close();
        factory.close();
    }
}
