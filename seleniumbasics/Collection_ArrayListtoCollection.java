package seleniumbasics;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_ArrayListtoCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(20);
		c.add("Kamala");
		c.add("Kamala");
		c.add("Laya");
		c.add(300);
		
		System.out.println(c);
		
		Collection <Object>c1= new ArrayList<Object>();
		c1.add(11);
		c1.add("Vaishu");
		c1.addAll(c);
		c1.add(null);
		c1.add(null);
		c1.add('A');
		c1.add(true);
		c1.add(false);
		System.out.println(c1);
		
		
		
		System.out.println(c1.contains("100"));
		System.out.println(c1.contains("Vaishu"));
		System.out.println(c1.containsAll(c));
	}

}


//82.WAP for Upcasting from ArrayList to Collection for  Heterogeneous