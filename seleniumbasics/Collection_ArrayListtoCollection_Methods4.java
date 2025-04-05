package seleniumbasics;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_ArrayListtoCollection_Methods4 {

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
		
		System.out.println(c1.contains(null));
		System.out.println(c.contains("Radha"));
		System.out.println(c1.containsAll(c));
		
		c1.addAll(c);
		System.out.println(c1);
		System.out.println(c1.containsAll(c));
		
	}

}
//89.WAP for Upcasting from ArrayList to Collection by using ..contains and .containsAll methods