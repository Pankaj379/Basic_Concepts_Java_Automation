package faq;

import java.util.Arrays;

public class Bubble_Sorting_Arrays {

	public static void main(String[] args) {
		// Bubble sorting technoque in array variable.
		
		int a[] = {1,56,36,6,55};
		
		System.out.println("Arrays values before sorting : "+Arrays.toString(a));
		int n = a.length;
		
		for(int i=0;i<n-1;i++) // Number of passes.
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Arrays after sorting elements : "+Arrays.toString(a));
		
	}

}
