package seleniumbasics;

import java.util.HashSet;
import java.util.Set;

public class Collection_SetProperties5 {
	public static void main(String[] args) {
		
		Set S1= new HashSet();
		S1.add(45);
		S1.add(45);
		S1.add(45);
		S1.add(55);
		S1.add(55);
		S1.add(55);
		S1.add(100);
		S1.add(99);
		S1.add(99);
		S1.add(null);
		S1.add(null);
		S1.add(null);
		S1.add(null);
		S1.add("Kamala");
		S1.add("Kamala");
		S1.add("Kamala");
		S1.add("Laya");
		S1.add("Laya");
		S1.add("Laya");
		
		System.out.println(S1);
		
	}

}

//WAP on Hashset to Set by using all set properties and add multiple duplicates and multiples null then check does Set accepts duplicates and null

//did not accepted duplicates
//accepts heterogeneous values
//does not follow indexing
//accepts only one null value