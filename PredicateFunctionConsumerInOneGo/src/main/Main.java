package main;

import java.util.ArrayList;
import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> Students = new ArrayList<Student>();
		populate(Students);
		Predicate<Student> p = s -> s.StudentMarks >= 60;
		Function<Student, String> f = s -> {
			int marks = s.StudentMarks;
			if (marks >= 80) {
				return "A";
			} else if (marks > 60) {
				return "First class";
			} else if (marks > 50) {
				return "second class";
			} else {
				return "Kya student banega re tu??";
			}
		};

		Consumer<Student> c = s -> {
			System.out.println("Student Name: " + s.StudentName);
			System.out.println("Student Marks: " + s.StudentMarks);
			System.out.println("Student Grade: " + f.apply(s));
			System.out.println();
		};
		for (Student s : Students) {
			if (p.test(s)) //predicate concept
				{
				c.accept(s); //consumer concept
			}
		}

	}

	private static void populate(ArrayList<Student> students) {
		students.add(new Student("Abhishek", 75));
		students.add(new Student("Ayush", 45));
		students.add(new Student("Gaurav", 65));
		students.add(new Student("Varuna", 35));
	}
}
