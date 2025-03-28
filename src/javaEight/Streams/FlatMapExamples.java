package javaEight.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    List<String> Subjects;

    public Student(String name, List<String> Subjects) {
        this.name = name;
        this.Subjects = Subjects;
    }
}

public class FlatMapExamples {

    // To Flatten List of Lists to a single List kind of operation
    public static void main(String args[]) {
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
                .collect(Collectors.toList());
        System.out.println("All Subjects are -> " + allSubject);
    }
}
