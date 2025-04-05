package seleniumbasics;

public class NonStaticParameterizedMethod {
	
			public static void main (String[] args) {
				
			NonStaticParameterizedMethod n1 = new NonStaticParameterizedMethod();

				n1.add (10,10);
				n1.subtract(100,10);
				n1.Multiply(10,10);
				n1.Division(200,20);
				
			}

			void add (int a, int b)
			
			{
				int c = a+b;			
				
				System.out.println("Addition of a+b is : " +c);
			}
			
			void subtract (int a, int b)

			{
								
				int c = a - b;
				System.out.println("Subtraction of a-b is : " + c);
			}
			
		void Multiply(int a, int b)

			{
				
				int c = a * b;
				System.out.println("Multiplication of a*b is : " + c);
			}

		void Division (int a, int b)

		{
			
			int c = a / b;
			System.out.println("Division of a/b is : " + c);
		}

		}

	


