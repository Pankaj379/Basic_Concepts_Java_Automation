package faq;

public class Even_Odd_Digits_In_Number {

	public static void main(String[] args) {
		
		// To Find Even and odd digits in a number.
		int num = 1234567, even_count=0, odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else 
			{
				odd_count++;
			}
			
			num=num/10;
		}
		
		System.out.println("Count of Even No is : "+ even_count);
		System.out.println("Count of Odd No is : "+ odd_count);
		

	}

}
