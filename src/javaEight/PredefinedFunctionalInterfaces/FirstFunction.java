package javaEight.PredefinedFunctionalInterfaces;

import java.util.function.Function;

public class FirstFunction {
	//First Argument is input second argument is the return type
	public static void main(String[] args) {
		Function< String, Integer > func = ( string ) -> {
			return string.length();
		};
		//apply is the abstract method
		System.out.println( func.apply("Heelllooo") );
	}

}
