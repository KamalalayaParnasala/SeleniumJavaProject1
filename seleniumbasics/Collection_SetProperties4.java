package seleniumbasics;

import java.util.HashSet;
import java.util.Set;

public class Collection_SetProperties4 {

	public static void main(String[] args) {
		
		Set <String> S1 = new HashSet<String> ();
		
		//Does not follow indexing
				S1.add("Kamala");
				S1.add("Laya");
				S1.add("100");
				S1.add("99");
				System.out.println("Not following indexing -->" + S1);
				
				//Does not follow duplicates
				
				
				S1.add("Kamala");
				S1.add("Laya");
				S1.add("Kamala");
				S1.add("Laya");
				S1.add("SriRam");
				S1.add("55");
				
				System.out.println("Does not allow duplicates  -->" + S1);
				
				//Accepts only one Null value
				
				S1.add("45");
				S1.add("55");
				S1.add("100");
				S1.add("99");
				S1.add("45");
				S1.add("Sita");
				S1.add(null);
				S1.add(null);
				
				System.out.println("Accepts only one null value  -->" + S1);
		
			}
}

//WAP on HashSet to Set by using all set properties for String values