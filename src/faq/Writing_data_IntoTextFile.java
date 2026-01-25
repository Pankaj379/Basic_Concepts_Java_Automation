package faq;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_data_IntoTextFile {

	public static void main(String[] args) throws IOException {
		
		// Writing Data into Text file.
		
		FileWriter fw = new FileWriter("F:\\Automation Testing\\Manual & Automation Testing\\Web_Testing\\test_write.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("This is to test the writer class.");
		bw.write("Tested and working fine.");
		
		System.out.println("Finished.....");
		
		bw.close();

	}

}
