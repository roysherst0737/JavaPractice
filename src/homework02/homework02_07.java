package homework02;

public class homework02_07 {
	/*
	  請設計一隻Java程式,輸出結果為以下:
	  A
      BB
      CCC
      DDDD
      EEEEE
      FFFFFF
	                           */

	public static void main(String[] args) {
		for (int i = 'A'; i <= 'F'; i++) {
			for (int j = 'A'; j <=i; j++ ) {
				System.out.print((char)i);
			}
			System.out.println();
		}
		
			
		

	}

}
