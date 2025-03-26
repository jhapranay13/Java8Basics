package javaEight.PredefinedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function< Integer, Integer > functionOne = ( integer ) -> {
			return (integer + integer);
		};
		Function< Integer, Integer > functionTwo = ( integer ) -> {
			return (integer * integer * integer);
		};
		System.out.println( functionOne.apply( 4 ) );
		System.out.println( functionTwo.apply( 4 ) );
		
		//These are default methods
		//andThen firstFunction will be called and then second function
		System.out.println( functionOne.andThen( functionTwo ).apply( 4 ) );
		//Second Function will be called and then the first function
		System.out.println( functionOne.compose( functionTwo ).apply( 4 ) );
		
		//identity is the static method which resturns same input so not in use much
		Function<String, String> identityFunction = Function.identity();
		System.out.println( identityFunction.apply("Pranay") );
	}

}
