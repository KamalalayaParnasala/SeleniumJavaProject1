package ArraysPractice;

public class Sum {

	public static void main(String[] args) {
		int[] numbers = { 3,7,2,9,4};
		int sum = 0;
		for (int i =0; i<numbers.length; i++)
		{
			if (numbers[i] % 2 == 0)
			
			{
				sum = sum+numbers[i];
			}
			
		}
		
		System.out.println(sum);
		

	}

}
