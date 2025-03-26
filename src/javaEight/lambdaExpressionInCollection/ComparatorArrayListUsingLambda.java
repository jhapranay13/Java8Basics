package javaEight.lambdaExpressionInCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorArrayListUsingLambda {

	//-ve value first after second, +ve value first before second, 0 equal
	//Smae concept can be used for TreeMap and TreeSet as well as custom Object
	public static void main(String[] args) {
		List< Integer > list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(3);
		list.add(5);
		list.add(9);
		list.add(14);
		System.out.println( "BEFORE SORTING >> " + list );
		Collections.sort( list, ( integerOne, integerTwo ) -> {
			return ( integerOne < integerTwo ) ? 1 : 
				( integerOne > integerTwo ) ? -1 : 0;
		});
		System.out.println( "AFTER SORTING >> " + list );
	}

}
