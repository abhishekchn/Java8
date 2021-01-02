package Main;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;
import java.lang.*;


public class Main {
/*
 * we use bifunction to make execution smooth to get over autoboxing and autounboxing i.e to int and integer like stuffs
 * it gets change like f.apply will be change to f.appyasInt in case of toIntFunction and so on. */
	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));

		IntFunction<Integer> f1 = i -> i * i; 	// IntFunction<r> , LongFunction<l> , DoubleFunction<f>
		System.out.println(f1.apply(6));		// biFunction as we are using only integer one time and return tyoe it is
												// taking by default.

		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("abhishek"));

		ToIntFunction<String> f3 = s1 -> s1.length(); //ToLongFunction<t> , ToDoubleFunction<t>
		Math.sqrt(25);
		System.out.println(f3.applyAsInt("abhishekPandey"));
		
		IntToDoubleFunction f4 = i->Math.sqrt(i); //IntToLongFunction , IntToDoubleFunction ,LongToIntFunction and so on..
		System.out.println(f4.applyAsDouble(25));
	}

}
