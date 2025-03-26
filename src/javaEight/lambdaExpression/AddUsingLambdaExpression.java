package javaEight.lambdaExpression;

interface AddMethodHolder {
	public void add( int a, int b );
}

public class AddUsingLambdaExpression {

	public static void main(String[] args) {
		AddMethodHolder holder = ( a, b ) -> {
			System.out.println( a + b );
		};
		
		holder.add( 12 , 2);
		holder.add( 13 , 2);

	}

}
