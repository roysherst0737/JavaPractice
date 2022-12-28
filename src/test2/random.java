package test2;

public class random {

	public static void main(String[] args) {
		System.out.println(Math.random());
		
		//1~10的亂數
		int r1 = (int)(Math.random()*10) + 1;
		System.out.println(r1);
		
		//0~30的亂數
		int r2 = (int)(Math.random()*31);
		System.out.println(r2);

	}

}
