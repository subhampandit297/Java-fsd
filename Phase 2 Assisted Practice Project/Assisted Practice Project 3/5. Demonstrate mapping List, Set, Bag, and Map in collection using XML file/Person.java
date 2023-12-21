import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private int id;
    private String name;
    private List<String> phoneNumbers;
    private Set<String> emailAddresses;
    private List<String> addresses;
    private Map<String, String> attributes;

    // Default constructor
    public Person() {
    }

    // Constructor with parameters
    public Person(int id, String name, List<String> phoneNumbers, Set<String> emailAddresses,
            List<String> addresses, Map<String, String> attributes) {
        this.id = id;
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
        this.addresses = addresses;
        this.attributes = attributes;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<String> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Set<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", emailAddresses=" + emailAddresses +
                ", addresses=" + addresses +
                ", attributes=" + attributes +
                '}';
    }
}
