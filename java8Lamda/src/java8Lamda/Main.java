package java8Lamda;

public class Main {

	public static void main(String[] args) {
		Lambda l = (a,b)->  (a+b);
		System.out.println(l.add(110, 220));
}
}