package day05;

public class While_VS_DoWhile {

	public static void main(String[] args) {
		// While vs Do while statements.

		// While:
		System.out.println("While Loop:");
		int a=-1;
		while(a<=5) {
			System.out.println(a);
			a++;
		}

		// Do while:
		System.out.println("Do While Loop:");

		int i=-1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		
	//	Note: In while and do while the only difference is in do while the statement run once if condition is not true.
		// But in while statement the condition is false then no statement will run.


	}
}
