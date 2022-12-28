package test5;

import java.util.Scanner;

//可利用正則表達式來確認使用者輸入資料的格式對不對

public class RegexTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String tel = sc.next();
		String regex = "^09\\d\\d-[0-9]{6}$";
		if (tel.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("Not good...");
		}
	}
}
