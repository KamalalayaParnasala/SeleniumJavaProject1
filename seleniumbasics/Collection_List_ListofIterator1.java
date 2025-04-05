package seleniumbasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_List_ListofIterator1 {

	
			public static void main(String[] args) {
				List<String> l1 = new ArrayList<String>();
				l1.add("Name");
				l1.add("Ram");
				l1.add("Sita");
				System.out.println(l1);
				Iterator<String> i1 = l1.iterator();
				System.out.println("This is Iterator");
				
				while(i1.hasNext())
				{
					System.out.println(i1.next());
				}
				
				ListIterator<String> l2 = l1.listIterator();
				System.out.println("Forward Iteration --> ");
				while(l2.hasNext())
				{
					System.out.println(l2.next());
				}
				System.out.println("Backward Iteration -->");
				while(l2.hasPrevious())
				{
					System.out.println(l2.previous());
					
				}
				
			}
		

	

}

