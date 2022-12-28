package homework01;

public class Homework01 { 
	
	public static void main (String [] args) {
	
	//HW1-1：請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println("數值和 = " + (a + b));
		System.out.println("數值積 = " +a * b);
		
	//HW1-2：請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)		
		int egg = 200;
		int doz = 12;
		System.out.println("200顆蛋共是" + (int)(egg/doz) + "打" + (egg%doz) + "顆" );
		
	//HW1-3：請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int all = 256559, sec, min, hr, day;
		day = all/(60*60*24);
		hr = (all/(60*60)) % 24;
		min = (all/60) % 60;
		sec = all % (60*60*24) % 60;
		System.out.println("256559秒為" + day + "天" + hr + "小時" + min + "分" + sec + "秒");
		
	//HW1-4：請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長	
		double pi = 3.1415;
		double S = 5*5*pi , C = 5*2*pi;
		System.out.printf("面積為%.2f%n" , S );
		System.out.printf("圓周長為%.2f%n" , C );
		
	/*HW1-5：
	  某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
	  請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)*/	
		int PV = 1_500_000;
		double R = 0.02;
		int FV = (int) (PV * Math.pow((1 + R) , 10));
		System.out.println("本金+利息共有" + FV + "元");
		
	/*HW1-6：
	  請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
	  5 + 5
	  5 + ‘5’
	  5 + “5”
	  並請用註解各別說明答案的產生原因*/
		System.out.println(5 + 5);     //結果為10，因為都是運算元，故會跟一般數學算式相同(兩個數值相加)
		System.out.println(5 + '5');   //結果為58，因為是運算元再加上單引號中字元代表的數字，'5'在unicode中等同於16進位的數值53
		System.out.println(5 + "5");   //結果為55，因為是運算元在加上雙引號中的字串，因此會直接以字串方式串接
	}

}
