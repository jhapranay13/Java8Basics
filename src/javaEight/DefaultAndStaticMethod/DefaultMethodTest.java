package javaEight.DefaultAndStaticMethod;

interface DefaultMethod {
	
	default void print() {
		System.out.println( "Default" );
	}
}

public class DefaultMethodTest implements DefaultMethod {
	
	//Can Be overriden too
	/*public void print() {
		System.out.println( "Overriden Default" );
	}*/

	public static void main(String[] args) {
		DefaultMethodTest test = new DefaultMethodTest();
		test.print();
	}

}
