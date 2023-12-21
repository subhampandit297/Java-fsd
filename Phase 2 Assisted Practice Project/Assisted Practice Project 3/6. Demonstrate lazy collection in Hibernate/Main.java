package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Fetch a person
            Person person = session.get(Person.class, 1L);

            // Accessing addresses will trigger lazy loading
            List<Address> addresses = person.getAddresses();
            for (Address address : addresses) {
                System.out.println("Address: " + address.getStreet());
            }

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
