package homework06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	
	public static void main (String[] args) {
		Calculator cal = new Calculator();
		double x, y;
		boolean checkNum = true;
		
		while (checkNum == true) {
		try {
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			System.out.println("請輸入x的值：");
			x = sc.nextDouble();
			System.out.println("請輸入y的值：");
			y = sc.nextDouble();
			System.out.println(x+ "的" + y+ "次方等於" + cal.powerXY(x, y));
			checkNum = false;
		} catch (InputMismatchException ce) {
			System.out.println("輸入格式不正確");
		} catch (CalException ce) {
			System.out.println(ce.getMessage());
		}		
	}
	}
}