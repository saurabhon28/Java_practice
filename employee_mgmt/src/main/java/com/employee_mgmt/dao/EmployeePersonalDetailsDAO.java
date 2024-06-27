package com.employee_mgmt.dao;

import com.employee_mgmt.model.EmployeePersonalDetails;
import com.employee_mgmt.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeePersonalDetailsDAO {
    private static final SessionFactory factory = HibernateUtil.getSessionFactory();

    public void saveEmployeePersonalDetails(EmployeePersonalDetails employeePersonalDetails) {
        try (Session session = factory.openSession()) {
            Transaction tx = null;
            try {
                tx = session.beginTransaction();
                session.save(employeePersonalDetails);
                tx.commit();
            } catch (Exception e) {
                if (tx != null) tx.rollback();
                e.printStackTrace();
            }
        }
    }
}
