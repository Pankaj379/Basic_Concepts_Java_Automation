package faq;

public class Find_No_Of_Digits_In_Number {

	public static void main(String[] args) {
		
		// Find the number of digits in a number.
		
		int num = 12345;
		
		int count = 0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Total number of digits in a number is: "+ count);

	}

}
