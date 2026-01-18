package faq;

import java.util.Arrays;

public class Check_Two_Arrays_Equal_Or_Not {

	public static void main(String[] args) {
		// First Approach using array equals method.
		
		int a1[]= {2,3,4,5,6,7};
		int a2[]= {2,3,4,5,6,8};
		/*
		boolean status= Arrays.equals(a1,a2);
		
		if(status==true)
		{
			System.out.println("Both Arrays are equals");
		}
		else
		{
			System.out.println("Noth arrays are not equal");
		}
		*/
		
		boolean status = true;
		
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
			
		}
		else 
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Both arrays are equal.");
		}
		else
		{
			System.out.println("Both arrays are NOT equal.");
		}

	}

}
