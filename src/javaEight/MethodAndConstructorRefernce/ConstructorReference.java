package javaEight.MethodAndConstructorRefernce;

class Sample {
	public Sample() {
		
	}
	
	public void print() {
		System.out.println( "It works" );
	}
}

interface SampleGetter {
	Sample get();
}
public class ConstructorReference {

	public static void main(String[] args) {
		SampleGetter ref = Sample::new;
		Sample obj = ref.get();
		obj.print();
	}

}
