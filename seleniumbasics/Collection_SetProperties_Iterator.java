package seleniumbasics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_SetProperties_Iterator {

	public static void main(String[] args) {
		Set<Integer> S1 = new HashSet<Integer>();
		S1.add(45);
		S1.add(55);
		S1.add(100);
		S1.add(99);
		System.out.println(S1);
		

		Set <String>S2 = new HashSet<String>();
		S2.add("Kamala");
		S2.add("Laya");
		S2.add("100");
		S2.add("99");
		System.out.println(S2);
		
		Iterator<Integer> i1 = S1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("New iterator -->");
		Iterator <String> i2 = S2.iterator();
				
		while (i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}

}
