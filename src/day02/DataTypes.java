package day02;

public class DataTypes {

	public static void main(String args[]) {

		// Data-types.

		//1. Numeric Data Types.

		int a=100, b=200;

		System.out.println("Value of a data type is: " + a);

		System.out.println("Value of b data type is: " + b);

		System.out.println(a+b);

		System.out.println("Value of both data type is: "+a+b);

		System.out.println(a+b+"Value of both data type is:");

		// concatination is used with first string then it's showing the response like this.

		System.out.println("The sum of a & b data type is: "+(a+b));

		byte by = 125;
		System.out.println(by);

		short sh = 3535;
		System.out.println(sh);

		long log = 1234567898765l; 
		// For long data type we have to add literals after the value like l or L.
		System.out.println(log);


		//2. Decimals: float and double.

		float fl=12.32F;
		// Literal Needed(F/f).
		System.out.println(fl);

		double dbl = 1213.4312313412;
		// Literal not needed/ Mostly used.
		System.out.println(dbl);

		//3. Single Character.

		char ch = 'A';
		System.out.println(ch);

		//	char ch = 'ABC'; // invalid
		//	String ch = 'ABC'; // invalid
		//	String ch = 'A'; // invalid
		//	String ch = "ABC"; // invalid

		//4. boolean data type.
		// Used to store the status.

		boolean bl = true;
		System.out.println(bl);

		//	boolean bl = "false"; // Invalid

		//	String bl = false; // Invalid

		//	String bl = "false"; // inValid





	}

}
