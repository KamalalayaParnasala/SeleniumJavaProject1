package seleniumbasics;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_ArrayListtoList_HomoHeterogeneous {

	public static void main(String[] args) {
		
		//Homogeneous collection values
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
		
		//Heterogeneous Collection values
		Collection c2 = new ArrayList();
		c2.add(11);
		c2.add("Vaishu");
		c2.addAll(c);
		c2.add(null);
		c2.add(null);
		c2.add('A');
		c2.add(true);
		c2.add(false);
		System.out.println(c2);
				
	}

}

//84.WAP for Upcasting from ArrayList to Collection for both Homogenious and Heterogeneous