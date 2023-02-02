package homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) {
//		arrAVG();
//		System.out.println("\n===============");
//		reverse();
//		System.out.println("\n===============");
//		reverse2();
//		System.out.println("\n===============");
//		vowel();
//		System.out.println("\n===============");
//		borrow();
//		System.out.println("\n===============");
//		dateOfYear();
//		System.out.println("\n===============");
//		score();
	}
	
	/* Q1:
	 * 有個一維陣列如下：
	 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	 */
	public static void arrAVG() {
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		int sum = 0;
		for (int i = 0 ; i < array.length; i++) {
			sum += array[i];
		}
		double arrayAVG = sum/array.length;
		System.out.println("此陣列所有元素的平均值為 " + arrayAVG);
		
		System.out.println("大於平均值的元素如下：");		
		for (int j = 0 ; j < array.length; j++) {
			if (array[j] > arrayAVG) {
				System.out.print(array[j] + " ");
			}
		}
	}
			
		
	/* Q2:
	 * 請建立一個字串，經過程式執行後，輸入結果是反過來的
	 * 例如String s = “Hello World”，執行結果即為dlroW olleH
	 */
	public static void reverse() {
		String s ="Hello World";
		for (int a = s.length(); a > 0 ; a--) {
			System.out.print(s.charAt(a - 1));
		}
	}
	
	public static void reverse2() {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			System.out.println(new StringBuffer(s).reverse());
		}		
	}
		
		
	/* Q3：
	 * 有個字串陣列如下(八大行星)：
	 * {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
	 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	 */
	public static void vowel() {
		String [] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		int count = 0;
		for (int b = 0; b < planet.length; b++) {
			for (int c = 0; c < planet[b].length(); c++ ) {
				char vowel = planet[b].charAt(c);
				if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
					count ++;
				}
			}
		}
		System.out.print("此陣列裡共有" + count + "個母音");
	}
	
	/* Q4：
	 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列表如下：
	 * | 員工編號 |  25  |  32  |  8   |  19  |  27  |
	 * | 身上現金 | 2500 | 800  | 500  | 1000 | 1200 |
	 * 請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:
	 * 例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共3 人!」
	 */
	public static void borrow() {
		int[][] coworker = {  { 25, 32, 8, 19, 27 }, 
						   { 2500, 800, 500, 1000, 1200 } 
						};
		int count = 0;
		System.out.println("請輸入欲借金額: ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();
			System.out.println("有錢可借的員工編號:");
			for (int i = 0; i < 5; i++) {
				if (coworker[1][i] >= money) {
					System.out.print(coworker[0][i] + "號，");
					count++;
				}
			}
		System.out.printf("共%d人%n", count);
	}	
	
	
	/* Q5：
	 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
	 * 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
	 */
	public static void dateOfYear() {
		int[] dateOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int[] date = new int[3];
			int sum = 0;
			System.out.println("輸入年月日三個號碼:");
			for (int i = 0; i < 3; i++) {
				date[i] = sc.nextInt();
				while (i == 0) {
					if (date[0] % 4 == 0 && date[0] % 100 != 0) {
						dateOfMonth[1]++;
					} else if (date[0] % 400 == 0) {
						dateOfMonth[1]++;
					}
					break;
				}

				while (i == 2) {
					if (date[i] > dateOfMonth[date[1] - 1] || date[i] < 0) {
						System.out.printf("月份輸入為%d,則日期不該超過%d,請重新輸入:", date[1], dateOfMonth[date[1] - 1]);
						date[i] = sc.nextInt();
					} else
						break;
				}
			}

			for (int j = 0; j < date[1] - 1; j++) {
				sum += dateOfMonth[j];
			}
			System.out.printf("輸入的日期為該年第%d天", sum + date[2]);
		}	
	
	/* Q6：
	 * 班上有8位同學，他們進行了6次考試，請算出每位同學考最高分的次數
	 */
	public static void score() {
		int[][] test = { 	{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
							{ 37, 75, 77, 89, 64, 75, 70, 95 },
							{ 100, 70, 79, 90, 75, 70, 79, 90 },
							{ 77, 95, 70, 89, 60, 75, 85, 89 },
							{ 98, 70, 89, 90, 75, 90, 89, 90 },
							{ 90, 80, 100, 75, 50, 20, 99, 75 } 
						};
		Integer[] x = new Integer[8];
		Integer[] y = new Integer[8];
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0};
		int c;
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[0].length; j++ ) {
				x[j] = test[i][j];
				y[j] = test[i][j];
			}
			Arrays.sort(x);
			
			c = Arrays.asList(y).indexOf(x[7]);
			count[c] += 1;
		}
		for (int k = 0; k < 8; k++) {
			System.out.println(k + 1 + "號" + count[k] + "次");
		}
	}
}


