package seleniumbasics;

public class StringClass3 {

	public static void main(String[] args) {
		String s = "Kamala";
		s.concat("Laya");
		System.out.println(s);
		
		String name = new String ("Kamala");
		name.concat("Laya");
		System.out.println(name);
		
		StringBuffer s1= new StringBuffer("Laxman");
		s1.append("Rai");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Monica");
		s2.append("Sharma");
		System.out.println(s2);
		
		String str1 = "Hello";
		String str2 = " World";
		String result = str1.concat(str2);
		System.out.println(result);
	}

}


