package com.employee_mgmt.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.employee_mgmt.model.EmployeeDependent;
import com.employee_mgmt.model.EmployeeMaster;
import com.employee_mgmt.model.EmployeePersonalDetails;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            synchronized (HibernateUtil.class) {
                if (sessionFactory == null) {
                    try {
                        Configuration configuration = new Configuration();

                        // Hibernate settings equivalent to hibernate.cfg.xml's properties
                        Properties settings = new Properties();
                        settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/employee_mgmt?useSSL=false");
                        settings.put(Environment.USER, "root");
                        settings.put(Environment.PASS, "Babu@2803");
                        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

                        settings.put(Environment.SHOW_SQL, "true");
                        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                        settings.put(Environment.HBM2DDL_AUTO, "update");

                        configuration.setProperties(settings);
                        configuration.addAnnotatedClass(EmployeeMaster.class);
                        configuration.addAnnotatedClass(EmployeeDependent.class);
                        configuration.addAnnotatedClass(EmployeePersonalDetails.class);

                        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                                .applySettings(configuration.getProperties()).build();

                        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                    } catch (Exception e) {
                        throw new ExceptionInInitializerError(e);
                    }
                }
            }
        }
        return sessionFactory;
    }
}

