package seleniumbasics;


public class ExceptionHandling_TryCatchBlock4 {

	public static void main(String[] args) {
		
		try
		{
		int rollno[]= new int [4];
		rollno[0] =10;
		rollno[1] =40;
		rollno[2] =110;
		rollno[3] =24;
		rollno[4] =10;
		rollno[5] =240;
		rollno[4] =10;
		rollno[5] =240;
		}
		catch (ArrayIndexOutOfBoundsException n)
		{
			System.out.println("Array index is out of bound, pls give less number of entries");
			
		}
		catch (NullPointerException n)
		{
			System.out.println("NullPointerException");
			
		}
					
	}

}
