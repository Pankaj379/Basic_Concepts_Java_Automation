package faq;

public class Max_and_Min_ValueOfArray {

	public static void main(String[] args) {
		
		// Max. and Min value of array.
		
		// Max. value in an Array:
		
		int a[]= {39,55,66,73,89};
		
		
		// Max Value.
		/*
		int max = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("The maximum value in an array is : "+ max); // 89
		
		*/
		
		// Min Value.
		int min = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("The minimum value in an array is : "+ min); //39

	}

}
