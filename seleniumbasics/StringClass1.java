package seleniumbasics;

public class StringClass1 {

	public static void main(String[] args) {
		
		String a = "automation testing";
		String b = "KAMALA LAYA";
		String str = "sri rama";
		String str2 = "SITA";
		String str3 = "sri rama";
		int l = a.length();
		System.out.println(l);
		char c = a.charAt(15);
		System.out.println(c);
		int i = a.indexOf('e');
		System.out.println(i);
		String u = a.toUpperCase();
		System.out.println(u);
		String l2= b.toLowerCase();
		System.out.println(l2);
		
		int x = str.length();
		System.out.println(x);
		
		String y = str.toUpperCase();
		System.out.println(y);
		
		String z = str2.toLowerCase();
		System.out.println(z);
		
		System.out.println(str2.equals(str));
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(a.compareTo(b));
		
		
		
		
	}

}