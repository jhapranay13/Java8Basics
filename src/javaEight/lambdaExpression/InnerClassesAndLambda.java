package javaEight.lambdaExpression;

class TestLambda {
	int x = 888;
	
	public void method1() {
		int y = 23;
		
		TestLambda2 lambda = new TestLambda2() {
			 int x = 999;
			
			 @Override
			public void lambdaMethod() {
				// value of y is efectively final for lambda method
				 //So cannot change local method variables in lambda expression
				 //and it can access even local method variables
				System.out.println( y );
				//this refers to inner class object's instance variable
				//not outer one
				System.out.println( this.x );
				//To Access the outer one
				System.out.println( "Accessing Outer Variable >> " + TestLambda.this.x );

			}
		};
		lambda.lambdaMethod();
	}
	
	public void method2() {
		TestLambda2 test2 = () -> {
				//This behaves like local variable
				int x = 898;
				System.out.println( "Local Variable >> " + x );
				//This reference over here refers to outer Object
				System.out.println( "Lambda Method >> " + this.x );
			};
		test2.lambdaMethod();	
	}
}

interface TestLambda2 {
	public void lambdaMethod();
}

public class InnerClassesAndLambda {

	public static void main(String[] args) {
		TestLambda test = new TestLambda();
		test.method1();
		test.method2();
	
	}

}
