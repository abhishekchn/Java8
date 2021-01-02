package Main;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class PrimitiveVersionOfSupplier {

	public static void main(String[] args) {
		// 1st code
		Supplier<Integer> s = () -> (int) (Math.random() * 10); // unboxing is not upto the mark performance degrades
		String OTP = " ";
		for (int i = 0; i < 6; i++) {
			OTP = OTP + s.get();
		}
		System.out.println(OTP);

		// 2nd code
		IntSupplier s1 = () -> (int) (Math.random() * 10); // IntSupplier, LongSupplier ,DoubleSupplier etc are the examples
		String OTP1 = " ";
		for (int i = 0; i < 6; i++) {
			OTP1 = OTP1 + s1.getAsInt();
		}
		System.out.println(OTP1);

	}

}
/*
 * Here Supplier type is of integer while math.random is producing is int so
 * everytime we have to face auto boxing and unboxing issue, so to overcome this
 * issue we will use primtive version of supplier which is written in second
 * code
 */
