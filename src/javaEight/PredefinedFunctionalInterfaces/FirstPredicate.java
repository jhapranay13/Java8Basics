package javaEight.PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class FirstPredicate {

	public static void main(String[] args) {
		Predicate< Integer > predicate = ( num1 ) -> {
			
			return num1 < 10 ? true : false;
		};
		System.out.println( predicate.test( 24 ) );
		System.out.println( predicate.test( 6 ) );
		
		Predicate< String > predicateString = ( string ) -> {
			
			return string.length() < 5 ? true : false;
		};
		System.out.println( predicateString.test( "Hello" ) );
		System.out.println( predicateString.test( "Hi" ) );
		//Can also be used in Collections Classes
	}
}
