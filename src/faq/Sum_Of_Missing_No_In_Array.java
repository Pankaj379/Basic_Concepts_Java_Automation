package faq;

public class Sum_Of_Missing_No_In_Array {

	public static void main(String[] args) {
		
		// Find sum of missing number in an array.
		
		int a[]= {1,2,3,4,5,7,8,9,10};
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++) // 0,1,2,3,4,5,
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in an Array: "+ sum1);
		
		int sum2=0;
		
		for(int i=1;i<=10;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of Range of the elements: "+ sum2);
		
		System.out.println("The missing number from an arrays is: "+ (sum2-sum1));

	}

}
