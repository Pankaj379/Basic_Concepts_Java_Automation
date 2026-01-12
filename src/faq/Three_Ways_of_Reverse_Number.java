package faq;

import java.util.Scanner;

public class Three_Ways_of_Reverse_Number {

	public static void main(String[] args) {
		// Three ways to reverse a number:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt(); // convert 1234 to 4321
		
		// 1) Using algorithm:
		/* int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}*/
		
		// 2) Using StringBuffer class:
		
	//	StringBuffer sb = new StringBuffer(String.valueOf(num));
	//	StringBuffer rev = sb.reverse();
		
	// 3) Using StringBuilder class:
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse number is: " + rev);

	}

}
