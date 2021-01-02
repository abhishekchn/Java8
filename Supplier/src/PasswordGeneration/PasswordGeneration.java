package PasswordGeneration;

import java.util.function.Supplier;

public class PasswordGeneration {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String PSW = " ";
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			String Symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> Symbols.charAt(((int) (Math.random() * 29)));
			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0) {
					PSW = PSW + d.get();
				} else {
					PSW = PSW + c.get();
				}
			}
			return PSW;
		};
		System.out.println(s.get());
	}

}
