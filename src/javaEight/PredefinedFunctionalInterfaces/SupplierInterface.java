package javaEight.PredefinedFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {
	
	public static void main( String args[] ) {
		Supplier< Integer > supplier = () -> {
			return (int) (Math.random() * 10);
		};
		System.out.println( supplier.get() );
	}
}
