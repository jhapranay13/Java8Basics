package javaEight.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsFirst {

	public static void main(String[] args) {
		List< Integer > list = new ArrayList<>();
		list.add(5);
		list.add(12);
		list.add(10);
		list.add(11);
		list.add(20);
		list.add(13);
		//Collect method collects objects from stream in the given collection
		//filter is filtering. Takes in Predicate
		List< Integer > listOne = list.stream().
				filter( ( number )-> number % 2 == 0 ).collect(Collectors.toList() );
		System.out.println( listOne );
		//mapping is mapping the result to the same index for example. Map takes in Function
		List< Integer > listTwo = list.stream().
				map( ( number )-> number * 2 ).collect(Collectors.toList() );
		System.out.println( listTwo );
		
		long count = listOne.stream().filter(( number )-> number % 2 == 0).count();
		System.out.println( count );
		
		List< Integer > sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println( sortedList );
		
		//- <minus used to reverse the order>
		List< Integer > sortedListDesc = list.stream().
				sorted( (num1, num2) -> -num1.compareTo(num2) ).collect(Collectors.toList());
		System.out.println( sortedListDesc );
		
		Integer minValue = list.stream().min( ( num1, num2 ) -> num1.compareTo(num2) ).get();
		System.out.println( minValue );
		
		Integer maxValue = list.stream().max( ( num1, num2 ) -> num1.compareTo(num2) ).get();
		System.out.println( maxValue );
		
		list.stream().forEach( element -> System.out.println( element ) );
		list.stream().forEach( System.out::println );
		System.out.println( maxValue );
		
		Integer[] ref = list.stream().toArray( Integer[]::new );
		System.out.println( Arrays.toString( ref ) );
		//for group of values seperatedby , or array values
		Stream<Integer> stream = Stream.of( 9,999,9999,9999,9999 );
		stream.forEach( System.out::println );
		Double[] da = { 10.1, 10.2, 10.3 };
		Stream<Double> stream2 = Stream.of( da);
		stream2.forEach( System.out::println );
	}

}
