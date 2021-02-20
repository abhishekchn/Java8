package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetIteration {

	public static void main(String[] arg) {
		Set<String> hs= new HashSet<String>();
		hs.add("abhishek");
		hs.add("dfg");
		hs.add("kllm");
		hs.add("jkm");
		hs.add("abhishek");
		System.out.println(hs);
		
		
		for(String name: hs) {
			System.out.println(name);
		}
	}
	
	
}
