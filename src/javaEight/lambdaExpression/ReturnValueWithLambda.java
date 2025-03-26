package javaEight.lambdaExpression;

interface ReturnValue {
	public int returnVal( String s );
}

//If using curly braces return statement is mandatory. else it is optional
public class ReturnValueWithLambda {

	public static void main(String[] args) {
		ReturnValue returnVal = ( string ) -> {
			return string.length();
		};
		System.out.println( returnVal.returnVal("HEllo") );
		System.out.println( returnVal.returnVal("My") );
	}
}
