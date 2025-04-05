package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArraylisttoLIstProgram1 {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("Kamala");
		l1.add("Krishna");
		l1.add(true);
		l1.add("Kamala");
		l1.add("Kamala");
		l1.add(null);
		l1.add(null);
		l1.add(12);
		System.out.println(l1);
		
		List <String> l2 = new ArrayList<String>();
		l2.add("Kamala");
		l2.add("Krishna");
		//l2.add(true);
		l2.add("Kamala");
		l2.add("Kamala");
		l2.add(null);
		l2.add(null);
		//l2.add(12);
		System.out.println(l2);
		
		List <Integer> l3 = new ArrayList<Integer>();
		/*l3.add("Kamala");
		l3.add("Krishna");
		l3.add(true);
		l3.add("Kamala");
		l3.add("Kamala");*/
		l3.add(null);
		l3.add(null);
		l3.add(12);
		System.out.println(l2);

	}

}
