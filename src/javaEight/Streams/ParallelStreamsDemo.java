package javaEight.Streams;

import java.util.List;

public class ParallelStreamsDemo {

    public static void main(String args[]) {
        // Parallel streams are used to process the data in parallel
        // The below code will print the numbers in random order
        // This is because the stream is processed in parallel

        List<Integer> numList = List.of(1, 4, 6, 23, 45, 3, 7, 18);
        numList.parallelStream().forEach(System.out::println);
        System.out.println("=====================================");
        numList.stream()
                .parallel()
                .forEach(System.out::println);
        // not always more efficient than sequential streams so be careful
    }
}
