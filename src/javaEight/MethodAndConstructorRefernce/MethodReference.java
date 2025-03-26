package javaEight.MethodAndConstructorRefernce;

interface reference {
	void method1();
}
public class MethodReference {

	public static void method2() {
		System.out.println( "static method" );
	}
	
	public void method3() {
		System.out.println( "Instance method" );
	}
	//only one restriction. The argument types should match. Access modifier return types and all might not
	public static void main(String[] args) {
		MethodReference obj = new MethodReference();
		reference r1 = MethodReference::method2;
		reference r2 = obj::method3;
		
		r1.method1();
		r2.method1();
	}

}
