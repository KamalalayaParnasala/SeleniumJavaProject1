package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaptotMapProgram2 {

	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("name", 215);
		m1.put("age", 14);
		
		System.out.println(m1);
		
		Set<String> s1 = m1.keySet();
		for(String key : m1.keySet())
		{
			System.out.println(key);
		}
		
		for(Integer value : m1.values())
		{
			System.out.println(value);
		}
		Set<Entry<String,Integer>> m2 =m1.entrySet();
		Iterator i1 = m2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		

	}

}
