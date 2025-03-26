package javaEight.PredefinedFunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfaces {

	//BiPredicate, BiFunction, BiConsumer
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = ( num1, num2 ) -> {
			return ( num1 + num2 ) <= 10;
		};
		BiConsumer< String, String > biConsumer = ( firstName, lastName ) -> {
			System.out.println( firstName + " " + lastName );
		};
		BiFunction<String, String, String> biFunction = ( firstName, lastName ) -> {
			return firstName + " " + lastName;
		};
		
		System.out.println( biPredicate.test( 12 , -2) );
		biConsumer.accept("Raghu", "Ram");
		System.out.println( biFunction.apply("Raghu", "Ram") );
	}

}
