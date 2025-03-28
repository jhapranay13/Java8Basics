package javaEight.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        String[] subjects = {"Maths", "Physics", "English", "History", "Geography", "Arts", "Chemistry",
                "Biology", "Computer Science", "Physical Education"};

        for (int i = 0; i < 10; i++) {
            studentList.add(new Student("Student " + i,
                    List.of(subjects[(int)(Math.random() * 10)], subjects[(int)(Math.random() * 10)],
                            subjects[(int)(Math.random() * 10)])));
        }

        List<String> allSubject = studentList.stream()
                .map(student -> student.Subjects)
                .flatMap(subjectList -> subjectList.stream())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Sorted Distinct Subjects are -> " + allSubject);

        int result = IntStream.range(1, 20)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of 1 to 5 is -> " + result);

        OptionalInt optional = IntStream.range(1, 20)
                .reduce((a, b) -> a + b);  // basically reducing the entire stream to one value maximum marks student or others

        if (optional.isPresent()) {
            System.out.println("Sum of 1 to 5 without identity -> " + optional.getAsInt());
        }

        List<Integer> numList = List.of(1, 4, 6, 23, 45, 3, 7, 18);
        // x is the previous result and y is the current element
        Optional<Integer> maxOptional = numList.stream().reduce((x, y) -> x < y ? y : x);

        if (maxOptional.isPresent()) {
            System.out.println("Max of the list is -> " + maxOptional.get());
        }
        numList.stream().skip(3).reduce((x, y) -> x + y).ifPresent(System.out::println);
        numList.stream().limit(3).reduce((x, y) -> x + y).ifPresent(System.out::println);

    }
}
