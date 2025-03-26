package javaEight.PredefinedFunctionalInterfaces;

import java.util.function.Function;

public class CalculateNumberOfSpacesUsingFunction {

	public static void main(String[] args) {
		String str = "My name is Pranay";
		Function< String, Integer > function = ( string ) -> {
			int returnVal = string.length() - string.replaceAll("\\s+", "" ).length();
			return returnVal;
		};
		System.out.println( function.apply( str ) );
	}

}
