package faq;

public class Remove_White_Spaces_From_String {

	public static void main(String[] args) {
		
		// Remove white spaces from string:
		String st= "This     is to test the removalv      of white space from     the string";
		
		System.out.println("Before removing white space: " + st);
		st = st.replaceAll("\\s", "");
		System.out.println("After removing white space: " + st);


	}

}
