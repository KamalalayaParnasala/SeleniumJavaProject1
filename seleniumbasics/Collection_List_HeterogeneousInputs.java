package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

public class Collection_List_HeterogeneousInputs {

	public static void main(String[] args) {
		
		//Printing heterogeneous properties of List, follows index.
		List l = new ArrayList();
		l.add("Kamala");
		l.add(10);
		l.add("Laya");

		System.out.println(l);
		
		
		List l1 = new ArrayList();
		l1.add("Krishna");
		System.out.println(l1);
		
		l1.addAll(l);
		System.out.println(l1);
		
		l1.addFirst("Saketh");
		System.out.println(l1);
		
		l1.addLast("Kiran");
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		
		l1.removeAll(l);
		System.out.println(l1);
		
		

	}

}

//92.WAP for  ArrayList to List by using  all List Properties for Heterogeneous.