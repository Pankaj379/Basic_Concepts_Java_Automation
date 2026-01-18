package faq;

public class Find_Element_From_Array_Linear_Approach {

	public static void main(String[] args) {

		// Find Element from array Linear Approach:

		int a[] = {23,45,77,33,55,77,22,66,77};

		int search_Ele = 22;

		boolean flag = false;

		for(int i=0;i<a.length;i++)
		{
			if(search_Ele==a[i])
			{
			System.out.println("Element found : "+search_Ele+" At Array position: "+ i);
			flag=true;
			break;
			}

		}
		
		if(flag==false)
		{
			System.out.println("Element not found..");
		}
		

	}

}
