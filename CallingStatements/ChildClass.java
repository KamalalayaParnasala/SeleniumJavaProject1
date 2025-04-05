package CallingStatements;

class ParentClass{
	void add()
	{
		System.out.println("Adding 2 numbers");
	}
}

public class ChildClass extends ParentClass {
	
	void add()
	{
		
		System.out.println("Adding 3 numbers");
		super.add();
	}

	public static void main(String[] args) {
		
		ChildClass c1 = new ChildClass();
		c1.add();
		
		

	}

}

//WAP on Method Overriding