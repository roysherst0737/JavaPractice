package homework05;

// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class Homework05_02 {	
	
	public static void randAvg() {
		System.out.println("本次亂數結果：");
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 101);
			System.out.print(a + " ");
			sum += a;
		}
		System.out.println("\n亂數平均值：" + (double) sum / 10);
	}
	
	public static void main(String[] args) {
		randAvg();
	}
}
