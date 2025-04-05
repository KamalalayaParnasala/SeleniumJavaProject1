package seleniumbasics;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_ArrayListtoCollection_Methods3 {

	public static void main(String[] args) {
		Collection <String> c = new ArrayList<String>();
		c.add("20");
		c.add("Kamala");
		c.add("Kamala");
		c.add("Laya");
		c.add("300");
		c.add(null);
		c.add(null);
		c.add("10");
		System.out.println(c);
		
		Collection<String> c1 = new ArrayList<String>();
		c1.add("200");
		c1.add("KamalaLaya");
		c1.add("Krishna");
		c1.add("Laya");
		c1.add("3000");
		c1.add(null);
		c1.add(null);
		c1.add("RamaKrishna");
		System.out.println(c1);
		
		c1.add("Radha");
		System.out.println(c1);
		
		c1.addAll(c);
		System.out.println(c1);
		
		c1.remove("Kamala");
		c1.remove("Laya");
		c1.remove("Kamala");
		c1.remove("Laya");
		
		System.out.println(c1);
		
		c1.removeAll(c);
		System.out.println(c1);
		System.out.println(c1.isEmpty());
		
		c1.removeAll(c1);
		System.out.println(c1.isEmpty());
	}

}
//88.WAP for Upcasting from ArrayList to Collection by using .isEmpty() method