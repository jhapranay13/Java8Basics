package javaEight.DefaultAndStaticMethod;

//Can even contain main method and run as java program in 1.8.
//Static Method in interface does not participate in inheritance and 
//is not overloaded. If the same method exists in implementing class
//it is not overloading parent class has separate implementation.
interface StaticMethod {
	
	static void print() {
		System.out.println( "Default" );
	}
}

public class staticMethodInInterfaces implements StaticMethod {

	public static void main(String[] args) {
		staticMethodInInterfaces test = new staticMethodInInterfaces();
		//test.print() won't work as Static Method in interface not part of implementing class
		//staticMethodInInterfaces.print() won't work as Static Method in interface
		//not part of implementing class
		StaticMethod.print();
	}

}
