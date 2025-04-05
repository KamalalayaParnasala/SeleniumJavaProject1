package seleniumbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_ArrayListtoCollection_Iterator {

	public static void main(String[] args) {
		
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(20);
		c.add(22);
		c.add(100);
		c.add(2856);
		c.add(300);
		System.out.println(c);
		
		Collection<String> c1 = new ArrayList<String>();
		c1.add("Kamala");
		c1.add("Krishna");
		c1.add("Radha");
		c1.add("Laya");
		c1.add("Sri Ram");
		System.out.println(c1);
		
		Iterator<String> i1 = c1.iterator();
		
		while (i1.hasNext())
		{
			
			System.out.println(i1.next());
		}
						
	}

}
//85..WAP for Upcasting from ArrayList to Collection by using Iterator