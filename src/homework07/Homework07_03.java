package homework07;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework07_03 {
	
	public static void copyFile(File A, File B) throws IOException {

		FileReader in = new FileReader(A);
		FileWriter out = new FileWriter(B);
		
		int i;
		while ((i = in.read()) != -1) {
			out.write(i);
			out.flush();
		}
		in.close();
		out.close();
	}
}
