package javaEight.PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionInterface {

	public static void main(String[] args) {
		IntFunction< Integer > functionOne = ( i ) -> i * i;
		System.out.println( functionOne.apply( 12 ) );
		ToIntFunction< String > functionTwo = ( string ) -> string.length();
		System.out.println( functionTwo.applyAsInt("NAME") );
		IntToDoubleFunction functionThree = ( i ) -> i * i;
		System.out.println( functionThree.applyAsDouble(56) );
	}

}
