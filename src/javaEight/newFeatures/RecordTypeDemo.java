package javaEight.newFeatures;


import java.util.Objects;

record Product(String name, int price) {
    // Record is a new feature in Java 14
    // It is a class that acts as a transparent carrier for immutable data
    // getter, setter, equals, hashcode, toString are automatically generated

    // Optional constructor
    public Product {
        // This is a constructor
        // It is used to initialize the record
        // It is used to validate the data
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public Product(String name) {
        // This is a constructor
        // It is used to initialize the record
        // It is used to validate the data
        this(name, 0);
    }
    // Optional methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

public class RecordTypeDemo {

    public static void main(String args[]) {
        Product product = new Product("Laptop", 1000);
        System.out.println(product);

        //Product product2 = new Product("Mobile", -1000);
        Product product3 = new Product("Mobile");
        System.out.println(product3);
    }
}
