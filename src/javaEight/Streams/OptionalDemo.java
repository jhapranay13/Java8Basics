package javaEight.Streams;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String args[]) {
        // Optional is a container object which may or may not contain a non-null value
        // If a value is present, isPresent() will return true and get() will return the value
        // Additional methods that depend on the presence or absence of a contained value are provided
        // such as orElse() (returns a default value if value not present) and ifPresent() (executes a block of code if the value is present)
        // Optional is a value-based class
        // Optional is Serializable
        // Optional is a public final class
        Optional<String> optional
                = Optional.ofNullable("Hello");
        System.out.println("Optional 1 >> " + optional.get());

        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println("Optional 2 >> " + optional2.orElse("World"));  // orElseGet
        System.out.println("Optional 2 is Empty >> " + optional2.isEmpty());


        System.out.println("is Present or empty >> " + returnVal("Hi").isPresent());
        optional.ifPresent(System.out::println);  // takes in a consumer

        optional.map(String::toUpperCase).ifPresent(System.out::println);

        Optional<Optional<Integer>> nested = Optional.of(Optional.of(5));

        nested.flatMap(num -> num).ifPresent(System.out::println);
    }

    private static <T> Optional<T> returnVal(T t) {
        return Optional.of(t);
    }
}
