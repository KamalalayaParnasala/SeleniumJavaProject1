package seleniumbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_HashMap4 {

	public static void main(String[] args) {
		Map <String, String> m1 = new HashMap<String, String>();
		
		m1.put("name1", "Kamala");
		m1.put("name2", "Laya");
		m1.put("name3", "Rama");
		m1.put("name4", "Krishna");
		System.out.println(m1);
		
		Map <String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Kamala", 25);
		m2.put( "Laya", 27);
		m2.put( "Rama", 35);
		m2.put( "Krishna", 14);
		System.out.println(m2);
		
		for (String key : m1.keySet())
		{
			System.out.println(key);
		}
		
		for (String value : m1.values())
		{
			System.out.println(value);
		}
		
	   Set<Entry<String,Integer>> s1 = m2.entrySet();
	   Iterator<Entry<String,Integer>>i1 = s1.iterator();
	   while (i1.hasNext())
	   {
		   System.out.println(i1.next());
	   }
	}

}
//does not follow indexing.