package javaEight.newFeatures;

interface Things {
}

record Car(String name, String model) implements Things {};
record House(String name, String address) implements Things {};

public class PatternMatchingDemo {

    public static void main(String argsp[]) {
        Object obj = "Hello";
        if (obj instanceof String str) {   // you can skip casting and declare a variable in the if condition
            System.out.println(str.toUpperCase());
        }
        Object obj2 = 10;

        switch (obj2) {
            case String str -> System.out.println(str.toUpperCase());
            case Integer i -> System.out.println(i);
            default -> throw new IllegalStateException("Unexpected value: " + obj2);
        }

        // will work with java 21 and above
        /*Things things = new Car("Toyota", "Camry");
        switch (things) {
            case Car( var name,  var model) -> System.out.println(name);

            default -> throw new IllegalStateException("Unexpected value: " + obj2);
        }*/

        // Gaurded pattern example
         /*Things things = new Car("Toyota", "Camry");
        switch (things) {
            case Car( var name,  var model) when name == null -> "";
            case Car( var name,  var model) -> System.out.println(name);

            default -> throw new IllegalStateException("Unexpected value: " + obj2);
        }*/
    }
}
