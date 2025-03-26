package javaEight.PrimitiveTypeFunctionalInterface;

import java.util.function.IntSupplier;

public class PrimitiveSupplierFuntionalInterface {

	public static void main(String[] args) {
		// Long, Double and Boolean supplier also available
		IntSupplier supplier = () -> (int)(Math.random() * 10);
		System.out.println( supplier.getAsInt() );
	}

}
