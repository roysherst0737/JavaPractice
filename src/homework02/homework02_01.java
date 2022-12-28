package homework02;

public class homework02_01 {
	//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

	public static void main(String[] args) {
		int a = 2;
		for(int count = 0; count <=1000 ; count+=2 ) {
			a +=count;
		}
		
		System.out.println("1~1000的偶數和 = " + a);
	}

}
