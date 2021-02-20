package collections;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class DemoSet {
	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		System.out.println(hs);

		boolean value = hs.contains("b");
		System.out.println(value);

		for (String hss : hs)
			System.out.print(hss + " ,");
		System.out.println();

		Set<Subjects> sub;
		sub = EnumSet.of(Subjects.Maths, Subjects.English, Subjects.Computer, Subjects.GK);
		System.out.println(sub);
	}

	enum Subjects {
		Maths, Computer, English, GK, Science
	};
}
