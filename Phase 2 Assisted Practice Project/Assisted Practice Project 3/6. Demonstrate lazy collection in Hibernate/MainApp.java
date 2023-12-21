
package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Cityville");
        address.setState("State");
        address.setZipCode("12345");

        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAddress(address);

        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
