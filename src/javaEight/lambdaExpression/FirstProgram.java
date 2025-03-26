package javaEight.lambdaExpression;
//@FunctionalInterface may be optional
interface functionInterFaceOne{
	void print();
}
public class FirstProgram {

	//Remove method name return type and access modifiers and you get lambda expression.
	//Type Inference - compiler can guess based on types.
	//So the types passed in method parameter is also optional.
	//Even return type is optional
	//if lambda expression has only one statement then braces becomes optional.
	//If the interface contains only one abstract method then the interface is 
	//called as functional interface. It can have static and default methods.
	//one abstract method is compulsory. Even if that method is inherited from
	//other interfaces.
	public static void main(String[] args) {
		functionInterFaceOne first = ()-> {
			System.out.println( "Hello" );
		};
		first.print();
	}

}
