package seleniumbasics;

import java.util.HashMap;
import java.util.Map;

public class Collection_HashMaptoMap1 {

	public static void main(String[] args) {
		
		Map m1 = new HashMap();
		m1.put("name1", "Kamala");
		m1.put("name2", "Laya");
		m1.put("name3", "Rama");
		m1.put("name4", "Krishna");
		System.out.println(m1);
		
		Map <String, Integer> m2 = new HashMap <String, Integer> ();
		m2.put("Kamala", 25);
		m2.put( "Laya", 27);
		m2.put( "Rama", 35);
		m2.put( "Krishna", 14);
		System.out.println(m2);
		
		Map <String, String > m3 = new HashMap <String, String > ();
		m3.put("Kamala", "25");
		m3.put( "Laya", "name");
		m3.put( "Rama", "35");
		m3.put( "Krishna", "14");
		System.out.println(m3);
		
		Map <String, String > m4 = new HashMap <String, String > ();
		m4.put("Vishwa", "25");
		m4.putAll(m3);
		System.out.println(m4);
		m4.replace("Rama", "53");
		System.out.println(m4);
		m4.replace("Krishna", "14", "15");
		System.out.println(m4);
		boolean answer = m4.isEmpty();
		System.out.println(answer);
		m4.clear();
		System.out.println(m4);
		boolean answer2 = m4.isEmpty();
		System.out.println(answer2);
	}

}

//does not accept indexing.
