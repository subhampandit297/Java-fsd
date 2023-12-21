package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainClass {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
