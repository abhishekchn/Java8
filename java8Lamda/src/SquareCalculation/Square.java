package SquareCalculation;

public class Square {
	public interface inter {
		public int squareInt(int x);
		
	}

	public static void main(String[] args) {
		inter i= (x)->(x*x);
		System.out.println(i.squareInt(5));
		

	}

}
