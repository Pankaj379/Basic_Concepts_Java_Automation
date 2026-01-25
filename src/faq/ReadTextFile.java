package faq;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// Read Data from the text file.
		
		/*
		
		// Approach01:Using filereader and buffered reader class
		FileReader fr = new FileReader("F:\\Automation Testing\\Manual & Automation Testing\\Web_Testing\\test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String st;
		
		while((st = br.readLine())!=null)
		{
			System.out.println(st);
		}
		
		br.close();
		
		*/
		
		
		
		// Approach02: Using file and Scanner class.
		
		File file = new File("F:\\Automation Testing\\Manual & Automation Testing\\Web_Testing\\test.txt");
		Scanner sc = new Scanner(file);
		
		/*
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		*/
		
		
		// Approach03: Using Delimeter instead of loop statement.
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		
		

	}

}
