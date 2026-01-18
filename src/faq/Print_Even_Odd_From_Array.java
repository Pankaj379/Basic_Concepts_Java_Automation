package faq;

public class Print_Even_Odd_From_Array {

	public static void main(String[] args) {
		// Print even and odd from array.
		
		int a[]= {4,6,8,9,7,6,9,2,5};
		
		// Extrating even and odd number.
		
		System.out.println("Even No. in arrays......");
		/*
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		*/
		
		// Enhanced for loop:
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		
		
		System.out.println("Odd No. in arrays......");
		
		/*
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		*/
		
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}

	}

}
