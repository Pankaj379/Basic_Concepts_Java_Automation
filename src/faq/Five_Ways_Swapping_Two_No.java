package faq;

public class Five_Ways_Swapping_Two_No {

	public static void main(String[] args) {
		
		// Swapping numbers:
		
		int a=10, b=20;
		
		System.out.println("Before Swapping Values are: "+a+" "+b);
		
		// 1) By using 3rd variable:
		//int t=a;
		//a=b;
		//b=t;
		
		// 2) Using arithmetic operator not using 3rd variable.
		// a=a+b; // a(10+20)=30
		// b=a-b; // b(30-20)=10
		// a=a-b; // a(30-10)=20
		
		// 3) Using multiple and divisible operator but it's only for non-zero values.
	 /* a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20 */
		
		
	//	4) Using bitwise XOR operator(^):
	/*	a=a^b; // 10^20=30
		b=a^b; // 30^20=10
		a=a^b; // 30^10=20 */
		
	// 5) Using single statement to swap numbers:
		b = a+b-(a=b); // 30-20=10(b) and a is already we have used a=b so a=20
		
		
		System.out.println("After swapping Values are: "+a+" "+b);

	}

}
