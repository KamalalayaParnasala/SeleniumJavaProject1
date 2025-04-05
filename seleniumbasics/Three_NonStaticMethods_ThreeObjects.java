package seleniumbasics;

public class Three_NonStaticMethods_ThreeObjects {
	
	int a = 15;
	int b = 25;

	public static void main(String[] args) {
		
		Three_NonStaticMethods_ThreeObjects n1 = new Three_NonStaticMethods_ThreeObjects();
		n1.add();
		
		Three_NonStaticMethods_ThreeObjects n2 = new Three_NonStaticMethods_ThreeObjects();
		n2.subtract();
		
		Three_NonStaticMethods_ThreeObjects n3 = new Three_NonStaticMethods_ThreeObjects();
		n3.multiplication();
	
	}

	
	public void add() {
		int c = a+b;
		System.out.println("c =" + " " +c);
		
	}
	
	public void subtract() {
		int c = a-b;
		System.out.println("c =" + " " +c);
		
	}
	
	public void multiplication() {
		int c = a*b;
		System.out.println("c =" + " " +c);
		
	}
	
}
