package faq;

public class Remove_SpecialChar_From_String {

	public static void main(String[] args) {
		
		// Methods to remove special character from the string:
		
        String s = "***233445566776%&%*&$^$& Hello! How are you? #Good -morning! &^*&%^% 1233445566776544";
        
      // s=s.replaceAll("[a-zA-Z0-9^]", " ");
      // s=s.replaceAll("[^a-zA-Z0-9]", " ");
        s=s.replaceAll("[0-9a-z^]", " "); // ***            %&%*&$ $& H    ! H          ? #G    -       ! & *&% %                 

      // s=s.replaceAll("[0-9^a-zA-Z]", " ");
      //  s=s.replaceAll("[^0-9A-Za-z]", " ");
        
        System.out.println(s);
       

		

	}

}
