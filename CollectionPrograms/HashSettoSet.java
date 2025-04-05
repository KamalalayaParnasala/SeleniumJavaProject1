package CollectionPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSettoSet {

	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add(12);
		s1.add("Kamala");
		s1.add("Kamala");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		
		Set <Integer>s2 = new<Integer> HashSet();
		s2.add(12);
		s2.add(22);
		s2.add(42);
		s2.add(52);
		s2.add(null);
		s2.add(null);
		System.out.println(s2);
		
		s1.addAll(s2);
		System.out.println(s1);
		
		Iterator i1 = s1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		
	}

}
