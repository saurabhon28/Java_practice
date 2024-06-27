package com.employee_mgmt_web.dao;

import com.employee_mgmt_web.model.EmployeePersonalDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeePersonalDetailsDAO {
	private static SessionFactory factory;

    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void saveEmployeePersonalDetails(EmployeePersonalDetails employeePersonalDetails) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(employeePersonalDetails);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
