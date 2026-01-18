package faq;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Generate_Random_Number {

	public static void main(String[] args) {
		
		// To generate random number.
		
		// Approach 1 using Random Class:
		Random ran = new Random();
		int num1= ran.nextInt(1000); // Range: 0 to 1000 
		System.out.println(num1);
		
		double num2= ran.nextDouble(); // Range: 0.0 to less than 1.0
		System.out.println(num2); 
		
		// Approach2: Using Math Class:
		
		System.out.println(Math.random());
		
		// Approach3: Using apache common lag API:
		
		@SuppressWarnings("deprecation")
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		System.out.println(generatedNumber);
		
		

        }
  }
