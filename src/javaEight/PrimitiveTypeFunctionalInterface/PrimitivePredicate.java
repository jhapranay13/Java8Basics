package javaEight.PrimitiveTypeFunctionalInterface;

import java.util.function.IntPredicate;

public class PrimitivePredicate {

	public static void main(String[] args) {
		// To avoid autoboxing and unboxing
		//Also have LongPredicate and DoublePredicate
		IntPredicate predicate = ( num ) -> num < 10;
		System.out.println( predicate.test( 20 ) );
	}

}
