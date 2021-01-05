package main;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryImpl { // unary operator is basically used to replace two arguments especially in
							// functions
							// when both passing type and return type is same
	 						// or input type and output type

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(10));

		// code2 using unary operators
		UnaryOperator<Integer> o = i -> i * i; ///again it will give AUB and AB issues...to we have bettter solution as below
		System.out.println(o.apply(20));

		IntUnaryOperator ip = i -> i * i; // LongUnaryOperator ,Double and so on.....
		System.out.println(ip.applyAsInt(5));
		
	}

}
