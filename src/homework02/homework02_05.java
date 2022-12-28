package homework02;

public class homework02_05 {
	/*
	  阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
	  請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	                                                      */
	
	public static void main (String [] args) {
		
		System.out.println("阿文可以選擇的數字為以下：");
		for (int i = 1; i <=49; i++) {
			if (i != 4 && i!=14 && i!=24 && i !=34 && i<=39) {
			System.out.print(i + " ");
			}
		}
		System.out.println('\n' + "總共有35的數字可以選");
	}

}
