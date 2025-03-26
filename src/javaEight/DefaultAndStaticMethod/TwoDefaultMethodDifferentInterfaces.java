package javaEight.DefaultAndStaticMethod;

interface DefaultMethodOne {
	
	default void print() {
		System.out.println( "Default One" );
	}
}

interface DefaultMethodTwo {
	
	default void print() {
		System.out.println( "Default Two" );
	}
}

public class TwoDefaultMethodDifferentInterfaces implements DefaultMethodOne, DefaultMethodTwo {

	public static void main(String[] args) {
		TwoDefaultMethodDifferentInterfaces test = new TwoDefaultMethodDifferentInterfaces();
		test.print();
	}

	//either override or call  DefaultMethodOne/Two.super.print() or else ambiguity problem
	@Override
	public void print() {
		DefaultMethodOne.super.print();
	}

}
