package homework02;

public class Homework02 {
	
	public static void main (String[] args) {
		
	//HW2-1：請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int a1 = 2;
		for (int count1 = 0; count1 <= 1000; count1 += 2) {
			a1 += count1;
		}
		System.out.println("1～1000的偶數和 = " +a1);		
		
	//HW2-2：請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int a2 = 1;
		for (int count2 = 1; count2 <= 10; count2++) {
			a2 *= count2; 
		}
		System.out.println("1～10的連乘積 = " + a2);		
		
	//HW2-3：請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int a3 = 1;
		int count3 = 1;
		while (count3 <= 10) {
			a3 *= count3;
			count3++;			
		}
		System.out.println("1～10的連乘積 = " + a3);
				
		
	/*HW2-4：
	  請設計一隻Java程式，輸出結果為以下：
	  1 4 9 16 25 36 49 64 81 100*/
		int a4 = 1;
		for (int i = 1; i <= 10; i++) {
			a4 = i*i;
			System.out.print(a4 + " ");
		}
		System.out.println(); //只為換行用
		
	/*HW2-5：
	  阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
	  請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？*/
		int x=0;
		System.out.println("阿文可以選擇的數字有以下：");
		for(int a5 = 1; a5 <= 49; a5++) {
			if (a5 != 4 && a5 !=14 && a5 != 24 && a5 !=34 && a5 <= 39 ) {
			System.out.print(a5 + " ");	
			x++;
			}
		}
		System.out.println('\n' + "總共有" + x + "個數字");
            
	/*HW2-6：
	  請設計一隻Java程式，輸出結果為以下：
	  1 2 3 4 5 6 7 8 9 10
	  1 2 3 4 5 6 7 8 9
	  1 2 3 4 5 6 7 8
	  1 2 3 4 5 6 7
	  1 2 3 4 5 6
	  1 2 3 4 5
	  1 2 3 4
	  1 2 3
	  1 2
	  1                       */
		for (int i6 = 10; i6 >= 1; i6--) {
			for (int j6 = 1; j6 <= i6; j6++) {
				System.out.print(j6 + " ");
			}
		System.out.println();
		}	
		
	/*HW2-7：
	  請設計一隻Java程式，輸出結果為以下：
	  A
	  BB
	  CCC
	  DDDD
	  EEEEE
	  FFFFFF                  */
		for (int i7 = 'A'; i7 <= 'F'; i7++) {
			for (int j7 = 'A'; j7 <= i7; j7++ ) {
				System.out.print((char)i7);
			}
			System.out.println();
		}	                                  
	}
}
