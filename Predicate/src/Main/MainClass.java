package Main;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {
		String[] names = { "Abhishek", "Gaurav", "Ayush", "", null, "shiva" };
		Predicate<String> P = s -> s != null && s.length() != 0;
		ArrayList<String> noNull = new ArrayList<String>();
		for (String s : names) {
			if (P.test(s)) {
				noNull.add(s);
				System.out.println(s);
			}
		}
	}
}
