package faq;

public class Sum_Of_Array {

	public static void main(String[] args) {
		
		// Sum of arrays.
		int a[]= {2,4,5,6,8,5,3,6};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum + ": is the sum of total arrays values.");

	}

}
