package seleniumbasics;

public class StringClass2 {

	public static void main(String[] args) {
		String a = "automation testing";
		String b = "";
		String c = "                Kamala      Laya              ";
		String d = "    Sri Ram   ";
		String s = a.substring(3);
		System.out.println(s);
		
		String s2 = a.substring(5, 10);
		System.out.println(s2);

		boolean s3 = b.isEmpty();
		System.out.println(s3);
		
		String s4 = a.replace("automation", "Selenium");
		System.out.println(s4);
		
		String s5= c.trim();
		System.out.println(s5);
		
		String s6= d.trim();
		System.out.println(s6);
		
}
}
