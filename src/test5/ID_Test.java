package test5;

import java.util.Scanner;

public class ID_Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String ID = sc.next();
		String regex = "^[A-Za-z][12]\\d{8}$";
		if (ID.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("Not good...");
		}
	}
}


