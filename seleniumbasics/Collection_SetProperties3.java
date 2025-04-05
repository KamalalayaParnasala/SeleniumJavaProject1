package seleniumbasics;

import java.util.HashSet;
import java.util.Set;

public class Collection_SetProperties3 {

	public static void main(String[] args) {
		Set<Integer> S1= new HashSet<Integer>();
		
		//Does not follow indexing
		S1.add(45);
		S1.add(55);
		S1.add(100);
		S1.add(99);
		System.out.println("Not following indexing -->" + S1);
		
		//Does not follow duplicates
		
		S1.add(45);
		S1.add(55);
		S1.add(100);
		S1.add(99);
		S1.add(45);
		S1.add(55);
		
		System.out.println("Does not allow duplicates  -->" + S1);
		
		//Accepts only one Null value
		
		S1.add(45);
		S1.add(55);
		S1.add(100);
		S1.add(99);
		S1.add(45);
		S1.add(55);
		S1.add(null);
		S1.add(null);
		
		System.out.println("Does not allow duplicates  -->" + S1);
					
	}
}
//WAP on HashSet to Set by using all set properties for Int values