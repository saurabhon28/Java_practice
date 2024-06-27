package com.employee_mgmt_web.dao;

import com.employee_mgmt_web.model.EmployeeDependent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDependentDAO {
	private static SessionFactory factory;

    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void saveEmployeeDependent(EmployeeDependent employeeDependent) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(employeeDependent);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
