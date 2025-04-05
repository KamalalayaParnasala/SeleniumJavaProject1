package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaptoMapProgram1 {

	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put("name", "Kamala");
		m1.put("age", "40");
		
		System.out.println(m1);
		Map<String, Integer>m2 = new HashMap<String, Integer>();
		m2.put("name", 123);
		m2.put("age", 25);
		System.out.println(m2);
		
		for (String key :m2.keySet())
		{
			System.out.println(key);
		}
		
		for (Integer value : m2.values())
		{
			System.out.println(value);
		}
		
		Set<Entry<String,Integer>> s1 =m2.entrySet();
		Iterator<Entry<String,Integer>> i1 = s1.iterator();
		
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
				

	}

}
