package seleniumbasics;

import java.util.HashSet;
import java.util.Set;

public class Collection_SetProperties1 {

	public static void main(String[] args) {
		Set<Integer> S1 = new HashSet<Integer>();
		S1.add(45);
		S1.add(55);
		S1.add(100);
		S1.add(99);
		System.out.println(S1);
		
		Set<Integer> S2 = new HashSet<Integer>();
		S2.add(45);
		S2.add(55);
		S2.add(15);
		S2.add(99);
		System.out.println(S2);


	}

}
