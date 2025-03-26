package javaEight.PrimitiveTypeFunctionalInterface;

import java.util.function.IntConsumer;

public class PrimitiveConsumerInterface {

	public static void main(String[] args) {
		// Also Has Long and Double Version
		IntConsumer consumer = ( i ) -> System.out.println( i * i );
		consumer.accept( 34 );
		//ObjIntConsumer< T > second argument in apply is int
		//ObjLongConsumer< T > second argument in apply is long
		//ObjDoubleConsumer< T > second argument in apply is long
	}

}
