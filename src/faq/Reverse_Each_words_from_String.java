package faq;

public class Reverse_Each_words_from_String {

	public static void main(String[] args) {
		// Reverse each word from String.
		/*
		String st = "Welcome to the java programming";
		
		String words[] = st.split(" ");
		
		String reverseStr = "";
		
		for(String w:words)
		{
			
			String reverseWord="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord = reverseWord + w.charAt(i);
			}
			
			reverseStr = reverseStr+reverseWord+" ";
		}
		
		System.out.println(reverseStr);
		
		*/
		
		// Approach:2
		String st = "Welcome to the java";
		String words[] = st.split("\\s");

		String reverseWord = "";
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord = reverseWord+sb.toString()+" ";
		}
		
		System.out.println(reverseWord);

	}

}
