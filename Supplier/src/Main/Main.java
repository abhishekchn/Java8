package Main;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String[] s1 = { "Sunny", "Bunny", "chinny", "abhishek", "csk" };
			int x = (int) (Math.random() * 4);// math.random will generate any number between 0 to 1 . i.e. 0<x<1.
												// 0.99*4=3.96 and int part
												// will be 3 only then according to that abhishek will be printed and so
												// on.
			return s1[x];
		};
		System.out.println(s.get());
	}

}
