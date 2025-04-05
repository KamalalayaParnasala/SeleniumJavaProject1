package StringFun;

public class SringFunProgram3 {

	public static void main(String[] args) {
		String s1 = "KAMALA";
		String s2 = "laya";
		
		char a = s1.charAt(2);
		System.out.println(a);
		
	boolean b	=s1.equals(s2);
	System.out.println(b);
	
	String c = s1.substring(0);
	System.out.println(c);
	
	String d = s1.substring(1, 4);
	System.out.println(d);
	
	String e = s1.toLowerCase();
	System.out.println(e);
	
	String f = s2.toUpperCase();
	System.out.println(f);
	
	int g = s2.length();
	System.out.println(g);
	
	boolean h = s2.isEmpty();
	System.out.println(h);
	
	boolean i = s2.contains("a");
	System.out.println(i);
	
	

	}

}
