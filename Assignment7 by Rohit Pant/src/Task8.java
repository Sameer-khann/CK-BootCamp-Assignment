import java.util.ArrayList;
import java.util.List;

class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Customer obj1 = new Customer(1, "Samir Khan", "samir@cloud.com");
        Customer obj2 = new Customer(2, "Rohit Pant", "rohit@ttn.com");
        Customer obj3 = new Customer(63, "Chankey", "chankey@cloud.com");

        List<Customer> Customer = new ArrayList<>();
        Customer.add(obj1);
        Customer.add(obj2);
        Customer.add(obj3);


        System.out.println("Customer Details : ");
        for (Customer c : Customer) {
            System.out.println(c);
        }
    }
}
