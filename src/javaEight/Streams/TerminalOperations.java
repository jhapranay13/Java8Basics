package javaEight.Streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String args[]) {
        List<Integer> numList = List.of(1, 4, 6, 23, 45, 3, 7, 18);
        String joining1 = numList.stream().map(elem -> "" + elem).collect(Collectors.joining(" - "));
        System.out.println("Collect 1 >> " +joining1);
        String joining2 = numList.stream().map(elem -> "" + elem).collect(Collectors.joining(" - ", "[", "]"));
        System.out.println("Collect 2 >> " +joining2);

        long count1 = numList.stream().filter(elem -> elem >= 20 ).collect(Collectors.counting());
        System.out.println("Count 1 >> " +count1);

        List<String> numAsStringList = numList.stream()
                .collect(Collectors.mapping(elem -> "" + elem, Collectors.toList()));
        System.out.println("Mapping >> " +numAsStringList);
        // Similarly MaxBy, summingInt, averagingInt
        Optional<Integer> minByOptional = numList.stream()
                .collect(Collectors.minBy((o1, o2) -> o1.compareTo(o2)));
        System.out.println("MinBy >> " +minByOptional.get());

        Map<String, List<Integer>> groupMap = numList.stream()
                .collect(Collectors.groupingBy(elem -> elem % 2 == 0 ? "Even" : "Odd"));
        System.out.println("Groupings  >> " + groupMap);


        Map<Boolean, Map<Object, List<Integer>>> groupMap1 = numList.stream()
                .collect(Collectors.groupingBy(elem -> elem > 5,Collectors.groupingBy(elem -> elem % 2 == 0 ? "Even" : "Odd")));
        System.out.println("Groupings1  >> " + groupMap);

        Predicate<Integer> predicateInteger = elem -> elem > 5;
        Map<Boolean, List<Integer>> partitionMap = numList.stream()
                .collect(Collectors.partitioningBy(predicateInteger));
        System.out.println("Partitioning  >> " + partitionMap);
     }
}
