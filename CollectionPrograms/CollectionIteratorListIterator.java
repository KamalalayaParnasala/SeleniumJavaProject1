package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionIteratorListIterator {

	public static void main(String[] args) {
		List c1 = new ArrayList();
		c1.add("12");
		c1.add(null);
		c1.add(10);
		c1.add("Kamala");
		c1.add(null);
		c1.add("Kamala");
		
		System.out.println(c1);
		
		System.out.println("forward iteration");
		Iterator i1 = c1.iterator();
		
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("forward iteration");
		ListIterator ltr = c1.listIterator();
		while(ltr.hasNext())
				{
			System.out.println(ltr.next());
				}

		System.out.println("backward iteration");
		while (ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
			
		}
	}

}
