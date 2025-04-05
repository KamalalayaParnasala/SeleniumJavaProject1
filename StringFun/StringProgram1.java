package StringFun;

public class StringProgram1 {

	public static void main(String[] args) {
		
		String str = "Kamala";
		str.concat("Laya");
		System.out.println(str);

		StringBuffer sb = new StringBuffer("Automation");
		sb.append("Testing");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Test");
		sb1.append("Test");
		System.out.println(sb1);
	}

}
