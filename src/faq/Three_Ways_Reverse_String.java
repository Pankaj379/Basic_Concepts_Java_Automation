package faq;

public class Three_Ways_Reverse_String {

	public static void main(String[] args) {
		
		// 3 Ways to reverse a String.
		
		// 1) Using +(String Concatination) Operator.
		
		String st = "ABCD";
		String rev= " ";
		
		int length = st.length(); //4
		/*
		for(int i=length-1;i>=0;i--) // 3 2 1 0 -1
		{
			rev=rev+st.charAt(i); // D C B A 
		}
		System.out.println("Reverse string is:"+rev);
		*/
		
		// 2) Using charcter array concept:
		/*
		char a[] = st.toCharArray();
		
		for(int i=length-1;i>=0;i--) // 3 2 1 0 -1
		{
			rev=rev+a[i]; // D C B A
		}
		
		System.out.println("Reverse string is:"+rev);
		*/
		
		// 3) Using StringBuffer class:
		StringBuffer sb = new StringBuffer(st);
		StringBuffer rev1 = sb.reverse();
		System.out.println("Reverse string is:"+rev1);

		
	}

}
