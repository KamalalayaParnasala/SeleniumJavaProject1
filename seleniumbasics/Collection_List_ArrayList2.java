package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

public class Collection_List_ArrayList2 {

	public static void main(String[] args) {
		
		List <Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(25);
		l.add(25);
		l.add(20);
		l.add(100);
		System.out.println(l);
		
		l.add(1, 200);
		System.out.println(l);
		
		List <Integer>l1= new ArrayList<Integer>();
		l1.add(2000);
		l1.add(203);
		l1.add(250);
		l1.add(600);
		System.out.println(l1);
		
		l1.addFirst(200);
		System.out.println(l1);
		
		l1.addLast(89);
		System.out.println(l1);
		
		l1.addAll(l);
		System.out.println(l1);
		
		l1.remove(0);
		System.out.println(l1);
		
		l1.removeAll(l);
		System.out.println(l1);
		
		}

}

//93.WAP for  (type[]) collection.toArray(new type[collection.size()])List to List by using  allList Properties  for Integer.