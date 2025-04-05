package seleniumbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_ArrayListtoCollection_BackwardIterator {

	public static void main(String[] args) {
		List<Integer> c = new ArrayList<Integer>();
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
				
		System.out.println("Forward Iteration-->" );
		ListIterator<Integer> i2 = c.listIterator();
		
		while (i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Backward Iteration-->" );
		while (i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
