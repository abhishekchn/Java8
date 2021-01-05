package main;

import java.util.function.BiFunction;

public class BinaryOperator {
	/*	 if input type and return type both are of same type we go for binary operator..
	 	interface BiFunction<T,U,R>
	{
		Public R apply(t t, U u);
	}
	*/
	public static void main(String[] args) {
		BiFunction<String,String,String> f=(s1,s2)->s1+s2;
		System.out.println(f.apply("Abhishek", "Pandey"));
//here we are using three parameters all are same..so to avoid these repetitions we will use binary operator.
		
		BinaryOperator f1 = (s1,s2)->s1+s2;
		System.out.println(f1.apply("ABhsihek" +"Pandey"));
		 

		public class GFG { 
			public static void main(String args[]) 
			{ 
				BinaryOperator<Integer> 
					op = BinaryOperator 
							.minBy( 
								(a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1)); 

				System.out.println(op.apply(98, 11)); 
			} 
		} 

	}

}
