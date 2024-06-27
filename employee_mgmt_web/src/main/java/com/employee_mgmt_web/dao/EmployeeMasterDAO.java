package com.employee_mgmt_web.dao;

import com.employee_mgmt_web.model.EmployeeMaster;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMasterDAO {
    private static SessionFactory factory;

    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public EmployeeMaster saveEmployeeMaster(EmployeeMaster employeeMaster) {
        Session session = factory.openSession();
        Transaction tx = null;
        EmployeeMaster savedEmployee = null;

        try {
            tx = session.beginTransaction();
            Long id = (Long) session.save(employeeMaster);
            tx.commit();
            savedEmployee = session.get(EmployeeMaster.class, id);
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        // Generate and update employee code after saving
        if (savedEmployee != null) {
            savedEmployee.setEmployeeCode(generateEmployeeCode(savedEmployee.getId()));
            updateEmployeeMaster(savedEmployee);
        }

        return savedEmployee;
    }

    private String generateEmployeeCode(Long id) {
        return "EMP" + String.format("%05d", id); // Generates codes like EMP00001, EMP00002, etc.
    }

    public void updateEmployeeMaster(EmployeeMaster employeeMaster) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(employeeMaster);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
