package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

public class Collection_List_ArrayList3 {

	public static void main(String[] args) {
	
		List <String> l = new ArrayList<String>();
		l.add("Kamala");
		l.add("25");
		l.add("25");
		l.add("Kamala");
		l.add("Laya");
		System.out.println(l);
		
		l.add(1, "200");
		System.out.println(l);
		
		List <String>l1= new ArrayList<String>();
		l1.add("2000");
		l1.add("Ram");
		l1.add("Krishna");
		l1.add("Laya");
		System.out.println(l1);
		
		l1.addFirst("200");
		System.out.println(l1);
		
		l1.addLast("89");
		System.out.println(l1);
		
		l1.addAll(l);
		System.out.println(l1);
		
		
		
		l1.remove(0);
		System.out.println(l1);
		
		l1.removeAll(l);
		System.out.println(l1);
		
		
	}

}





//94.WAP for ArrayList to List by using all List Properties  for String