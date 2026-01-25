package faq;

public class Number_Of_Char_Occurance_In_string {

	public static void main(String[] args) {
		
		// Number if character occurance in a String.
		String s= "Java programing opps concepts of java is important.";
		
		int s1 = s.length();
		
		int s2 = s.replaceAll("a", "").length(); // total length after removal if a.
		
		int count = s1-s2;
		
		System.out.println("Number of occurance of a char is : "+ count);

	}

}
