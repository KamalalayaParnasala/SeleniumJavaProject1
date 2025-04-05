package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionProgram1 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("Kamala");
		c1.add("Laya");
		c1.add("Rama");
		c1.add("Kamala");
		
		System.out.println(c1);
		Iterator i1 = c1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
