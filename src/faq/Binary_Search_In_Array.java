package faq;

import java.util.Arrays;

public class Binary_Search_In_Array {

	public static void main(String[] args) {
		
		// Binary search in an array.
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 6;
		int l = 0;
		int h= a.length-1;
		boolean flag = false;
		
		while(l<=h)
		{
			int m = (l+h)/2;
			
			if(a[m]==key)
			{
				System.out.println("Element found...");
				flag = true;
				break;
			}
			
			if(a[m]<key)
			{
				l=m+1;
			}
			
			if(a[m]>key)
			{
				h=m-1;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Element NOT Found.");
		}
		
		
		// Approach 2: Using direct inbuilt method
		// This method returns the position of the array value and when not found then give negative value.
		
		System.out.println("Position of searched element in array is : "+Arrays.binarySearch(a, 5)); // 4
		System.out.println("Position of searched element in array is : "+Arrays.binarySearch(a, 595)); // -11
		

	}

}
