package homework02;

public class homework02_02 {
	//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

	public static void main(String[] args) {
		int a = 1;
				
		for( int count = 1; count <=10 ; count++) {
			a*=count;
		}
		
		System.out.println("1~10的連乘積(用for迴圈) = " + a);
			
	}

}
