class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative for product : " + name);
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("  ");
    }
}

public class Task11 {
    public static void main(String[] args) {
        try {
            Product p1 = new Product(101, "Laptop", 55000);
            Product p2 = new Product(102, "Headphones", 2000);
            Product p3 = new Product(103, "Smartphone", 25000);
            Product p4 = new Product(104, "Mouse", -500);

            p1.displayProduct();
            p2.displayProduct();
            p3.displayProduct();
            p4.displayProduct();

        } catch (InvalidPriceException e) {
            System.out.println("Error: " + e);
        }
    }
}
