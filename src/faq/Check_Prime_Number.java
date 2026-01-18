package faq;

public class Check_Prime_Number {

	public static void main(String[] args) {

		// Check the number is prime or not.

		// Condition for prime no is 1st the no should be greater than 1.
		// 2nd Condition is the it has only 2 factors not more.

		int num=8;
		int count=0;

		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				   count++;
			}
			if(count==2)
			{
				System.out.println(num+": is a Prime Number.");
			}
			else
			{
				System.out.println(num+": is not a Prime Number.");
			}


		}
		else
		{
			System.out.println(num+": is not a Prime Number.");
		}

	}

}
