package test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileLength {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\JavaPracticeFiles\\javatest\\CSVTest.csv");
		System.out.println(file.length());
		
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream fis = new FileInputStream("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\JavaPracticeFiles\\javatest\\CSVTest.csv");
		System.out.println("The above is the length of this file.");

	}

}
