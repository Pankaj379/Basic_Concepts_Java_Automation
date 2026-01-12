package faq;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		
		// Check the Palindrom String Concept:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name to check Palindrome Concept :");
		
		String str = sc.next();
		String org_str = str;
		
		String rev="";
		
		int length = str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" : string is a Palindrome String.");
		}
		else
		{
			System.out.println(org_str+" : String is not a Palindrom String");
		}
		
	}

}
