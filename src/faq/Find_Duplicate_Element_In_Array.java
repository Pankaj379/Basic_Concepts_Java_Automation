package faq;

public class Find_Duplicate_Element_In_Array {

	public static void main(String[] args) {
		
		// Find the Duplicate Element In an Array.
		
		String st[] = {"java","python","C","C++","python"};
		
		boolean flag = false;
		
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i]==st[j])
				{
				flag=true;
				System.out.println("Found Duplicate value : "+ st[i]);
				}
			}
		}
		
		if(flag==false) 
		{
			System.out.println("Duplicate value not found.");
		}

	}

}
