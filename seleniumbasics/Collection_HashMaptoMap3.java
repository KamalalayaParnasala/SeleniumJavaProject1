package seleniumbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_HashMaptoMap3 {

	public static void main(String[] args) {
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("name1", 'f');
		m1.put("name2", 'm');
		m1.put("name3", 'f');
		m1.put("name4", 'm');
		m1.put("name5", 'm');
		m1.put("name6", 'm');
		System.out.println(m1);
		
		//Set<String> s1 = m1.keySet();
		
		for ( String key : m1.keySet())
		{
			System.out.println(key);
		}
		
		for (Character value : m1.values())
		{
			System.out.println(value);
		}
		
		Set<Entry<String,Character>>kv = m1.entrySet();
		Iterator <Entry<String,Character>> i1 = kv.iterator();
		
		while (i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		
	}

}
