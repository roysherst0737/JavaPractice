package homework02;

public class homework02_03 {
	//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

	public static void main(String[] args) {
		int a = 1;
		int count = 1;
		while (count <= 10) {
			a *= count;
			count++;
		}
		System.out.println("計算1~10的連乘積(用while迴圈) = " + a);

	}

}
