package javaEight.PrimitiveTypeFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorAndBinaryOperator {

	public static void main(String[] args) {
		// Also Has Primitive Version. Used if input and output types are same
		//Long And double and int
		UnaryOperator<Integer> uop = ( i ) -> i*i;
		System.out.println( uop.apply(34) );
		
		//Applied if input and output all are of same type
		//also have primitve long, double and int version
		BinaryOperator<String> bop = ( firstName, lastName ) -> firstName + " " + lastName;
		System.out.println( bop.apply("first", "second") );
	}

}
