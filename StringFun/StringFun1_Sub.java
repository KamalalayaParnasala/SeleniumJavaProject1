package StringFun;

public class StringFun1_Sub {

	public static void main(String[] args) {
		String s1 = "Kamalalaya";
		String s2 = "  KAMALA LAYA   ";
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(5));
		System.out.println(s2);
		
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		//System.out.println(s2.equals(s1));
		boolean answer = s1.equals(s2);
		System.out.println(answer);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.trim());
		System.out.println(s1.replace("K", "R"));
		System.out.println(s1.concat(s2));
		//System.out.println(s1.compareTo(s2));
		int answer2 = s1.compareTo(s2);
		System.out.println(answer2);
		System.out.println(s1.indexOf("l"));
	}

}
