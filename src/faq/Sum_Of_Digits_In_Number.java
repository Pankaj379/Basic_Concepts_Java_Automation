package faq;

public class Sum_Of_Digits_In_Number {

	public static void main(String[] args) {
		// Find the sum of digits in a number.
		
		int num=12345786, sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits are : "+sum);

	}

}
