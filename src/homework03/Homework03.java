package homework03;

import java.util.Scanner;

public class Homework03 {
	
	public static void main(String[] args) {
		Homework03 HW = new Homework03();
//		HW.TriangleGame();
//		HW.GuessNumber();
		HW.LotteryGame();
		
	}
	
	//1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形(進階：加入直角三角形的判斷)
	public void TriangleGame() {
		int[] x = new int[3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		System.out.println("請輸入三個整數：");
		for(int i = 0; i < x.length; i++) {
				x[i] = sc.nextInt();
		}
		if(x[0] + x[1] <= x[2] || x[1] + x[0] <= x[2] || x[1] + x[2] <= x[0] ) {
				System.out.println("不是三角形");
		}
		else if (x[0] == x[1] && x[1] == x[2]) {
				System.out.println("正三角形");
		}
		else if (x[0] == x[1] || x[0] == x[2] || x[1] == x[2]) {
			System.out.println("等腰三角形");
		}
		else if (Math.pow(x[0], 2)+Math.pow(x[1], 2) == Math.pow(x[2], 2) || Math.pow(x[0], 2)+Math.pow(x[2], 2) == Math.pow(x[1], 2) || Math.pow(x[1], 2)+Math.pow(x[2], 2) == Math.pow(x[0], 2 )) {
			System.out.println("直角三角形");
		}
		else 
			System.out.println("其他三角形");		
	}
	
	//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息(進階：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
	public void GuessNumber() {
		int i = (int) (Math.random() * 10);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		while ( i != sc.nextInt() ) {
			System.out.println("猜錯囉");
		}
		System.out.println("答對囉，答案就是" + i );
	}
	
	//阿文又想簽大樂透(整數1~49)，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數(進階：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
	public void LotteryGame() {
		int a = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("傲嬌的阿文，請輸入你討厭哪個數字???");
		int x = sc.nextInt();
		for (int i = 1; i < 50; i++) {
			if (i % 10 != x && i / 10 != x) {
				System.out.printf("%3d", i);
				a++;
			}
			if (a % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.printf("總共有%d個數字\n", a);
	}
}
	
