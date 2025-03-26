package javaEight.lambdaExpression;

public class RunnableUsingLambda {

	//Also example of replacing inner Class with Lambda Expression
	//But lambda Epression cannot be used to extend abstract class or concrete class
	//to write anonymus inner classes. So can be used only with functional interfaces
	public static void main(String[] args) {
		Runnable runnable = () -> {
			
			for( int i = 0; i < 10; i++ ) {
				System.out.println( "Thread" );
			}
		};
		Thread thread = new Thread( runnable );
		Thread thread1 = new Thread( () -> {
			
			for( int i = 0; i < 10; i++ ) {
				System.out.println( "ANother Child" );
			}
		});

		thread.start();
		thread1.start();
		for( int i = 0; i < 10; i++ ) {
			System.out.println( "MAin Thread" );
		}
	}

}
