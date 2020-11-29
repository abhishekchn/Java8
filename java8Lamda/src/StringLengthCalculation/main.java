package StringLengthCalculation;

public class main {
	
	public interface interf {
		public int lengthOfString(String S);
	}

	public static void main(String[] args) {
		interf i = (s)->s.length();
		System.out.println(i.lengthOfString("abhishek"));
	}

}
