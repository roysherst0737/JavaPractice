package test3;

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class ImportAPI {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
		}
		@SuppressWarnings("unused")
		File file = new File("C:\\javawork\\Hello.txt");
		int[] iArray = {2, 3, 1};
		Arrays.sort(iArray);
		
		@SuppressWarnings("unused")
		String str = "Hello";
		
		System.out.println((int)(Math.random()*10));
		
		@SuppressWarnings("unused")
		Animal a = new Animal(2,5.0f);

	}

}
