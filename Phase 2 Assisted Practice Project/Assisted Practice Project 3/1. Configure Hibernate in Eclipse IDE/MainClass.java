package com;

public class MainClass {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        // Use sessionFactory to get a Session and perform database operations
        // ...
        sessionFactory.close(); // Don't forget to close the sessionFactory when done
    }
}
