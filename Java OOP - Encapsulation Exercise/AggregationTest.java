
/*
Exercise 5: Encapsulation with Aggregation
Create two classes:
1. Address
o Private fields: city, country.
o Provide constructors, getters, and setters.
o Add a method summary() to return "city, country".
-------------------------------------------------------------
2. Person
o Private fields: name, Address.
o Provide constructors, getters, and setters.
o Add a method printProfile() to display person’s name and address.
• In the main method, create a Person with an Address and print the profile.
 */



// Address class
class Address {

    private String city;
    private String country;

    // Constructor
    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    // Getters and setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Summary method
    public String summary() {
        return city + ", " + country;
    }
}

// Person class
class Person {

    private String name;
    private Address address;   // Aggregation

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Print profile
    public void printProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.summary());
    }
}

// Main class
public class AggregationTest {
    public static void main(String[] args) {

        Address addr = new Address("Dhaka", "Bangladesh");
        Person person = new Person("A.S.M. Morshed", addr);

        person.printProfile();
    }
}

/*
Name: A.S.M. Morshed
Address: Dhaka, Bangladesh
 */