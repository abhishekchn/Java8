package collections;
// Java program to demonstrate a List 

import java.util.ArrayList;
import java.util.List; 

public class MainClass { 
	
	public static void main(String[] args) 
	{ 
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(0,1);
	l1.add(1,0);
	l1.add(1,2);
	System.out.println(l1);
	
	List<Integer> l2 = new ArrayList<Integer>();
	l2.add(3);
	l2.add(1,4);
	l2.addAll(2,l1);
	System.out.println(l2);
	
	l2.set(2,2);
	System.out.println(l2);
	
	l2.remove(2);
	for (int i=0; i<=l2.size();i++)
	System.out.println(l2.get(i) + " ");
	

	}
}
