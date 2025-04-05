package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListtoListProgram2 {

	public static void main(String[] args) {
		List <String> l2 = new ArrayList<String>();
		l2.add("Kamala");
		l2.add("Krishna");
		//l2.add(true);
		l2.add("Kamala");
		l2.add("Kamala");
		l2.add(null);
		l2.add(null);
		//l2.add(12);
		System.out.println(l2);
		
		List <Integer> l3 = new ArrayList<Integer>();
		l3.add(null);
		l3.add(null);
		l3.add(12);
		l3.add(44);
		l3.add(32);
		System.out.println(l3);
		
		
		List <Integer> l4 = new ArrayList<Integer>();
		l4.add(null);
		l4.add(null);
		l4.add(12);
		l4.add(44);
		l4.add(32);
		System.out.println(l4);
		
		l4.addAll(l3);
		System.out.println(l4);
		l4.remove(3);
		System.out.println(l4);
		
		
		Iterator<Integer> i1= l3.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator ltr = l3.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		

	}

}
