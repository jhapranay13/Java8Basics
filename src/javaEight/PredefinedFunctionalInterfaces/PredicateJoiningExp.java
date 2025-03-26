package javaEight.PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateJoiningExp {

	public static void main(String[] args) {
		int arr[] = { 0, 5, 10, 15, 20, 25, 30, 45 };
		Predicate< Integer > p1 = ( num ) -> {
			return num < 10 ? true : false; 
		};
		Predicate< Integer > p2 = ( num ) -> {
			return ( num % 2 ) == 0 ? true : false; 
		};
		//All above are Default Method
		//negate is opposite of predicate
		//methodPredicate( p1.negate(), arr );
		//Joins both predicate in and method
		//methodPredicate(p1.and(p2), arr);
		//Joins both predicate in or method
		//methodPredicate(p1.or(p2), arr);
		//isEqual is Static Method and uses equals method of custom Object.
		//So override equals method
		Predicate< Integer > equalityCheck = Predicate.isEqual( new Integer( 10 ) );
		methodPredicate(equalityCheck, arr);
	}

	private static void methodPredicate(Predicate<Integer> p, int[] arr) {
		
		for( int i = 0; i < arr.length; i++ ) {
			//test is the abstract method
			if( p.test( arr[ i ] ) ) {
				System.out.println( arr[ i ] );
			}
		}
	}

}
