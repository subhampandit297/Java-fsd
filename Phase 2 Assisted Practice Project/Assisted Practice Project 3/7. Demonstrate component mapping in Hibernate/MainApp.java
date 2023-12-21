import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        // Create SessionFactory and open a new Session
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Create an employee with an address
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Cityville");
        address.setState("State");
        address.setZipCode("12345");

        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAddress(address);

        // Save the employee to the database
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();

        // Close the session and sessionFactory
        session.close();
        sessionFactory.close();
    }
}
