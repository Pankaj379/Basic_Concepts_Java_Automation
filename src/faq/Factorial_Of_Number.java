package faq;

public class Factorial_Of_Number {

	public static void main(String[] args) {
		
		// The factorial of a number.
		//When in Increment Order: 5! = 1 * 2 * 3 * 4 * 5 = 120
		
		int fact=1, num=5;
		/*
		for(int i=1;i<=num;i++) // 1 2 6 24 120
		{
			fact=fact * i; 
		}
		*/
		
		
		//Now in decrement Order: 5! = 5 * 4 * 3 * 2 * 1 = 120
		
		for(int i=num;i>=1;i--) 
		{
			fact=fact * i;  // 5 20 60 120
		}
		
		
		System.out.println(fact+": is the factorial of a number "+num+".");

	}

}
