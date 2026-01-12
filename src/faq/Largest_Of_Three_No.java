package faq;

import java.util.Scanner;

public class Largest_Of_Three_No {

	public static void main(String[] args) {
		
		// Approach 1:
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the first value of b : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the first value of c : ");
		int c = sc.nextInt();
		/*
		if(a>b && a>c)
		{
			System.out.println(a+": is a largent number.");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+": is a largent number.");
		}
		else
		{
			System.out.println(c+": is a largent number.");
		}
		*/
		
		// Approach2: Ternary Operator
		
//		int largest = a>b?a:b; // largest from a and b.
//		largest = c>largest?c:largest; // between the lagest and c.
		int largest = c>(a>b?a:b)?c:(a>b?a:b); // between the lagest and c.
		
		System.out.println(largest + ": is the largest value.");
		
		
	}

}
