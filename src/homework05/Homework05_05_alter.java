package homework05;

import java.util.ArrayList;
import java.util.List;

public class Homework05_05_alter {
	
	private static String genAuthCode() {
		System.out.println("本次隨機產生驗證碼為：");

		List<Character> pool = new ArrayList<Character>();

		for (int i = 0; i < 26; i++) {
			pool.add((char) ('a' + i));
		}
		for (int i = 0; i < 26; i++) {
			pool.add((char) ('A' + i));
		}
		for (int i = 0; i < 10; i++) {
			pool.add((char) ('0' + i));
		}
		String str = "";

		for (int i = 0; i < 8; i++) {
			str+=pool.get( (int)(Math.random()*pool.size()));
		}
		return str;
	}
	
	public static void main (String [] args) {
		System.out.println(genAuthCode());
	}

}
