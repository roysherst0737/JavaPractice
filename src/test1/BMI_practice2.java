package test1;

public class BMI_practice2 {

	public static void main(String[] args) {
		
		double height = 1.79, weight = 79;
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI = " + bmi);
		System.out.printf("BMI = %.2f%n", bmi);
		
		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (bmi>=24 ) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}
	}
}
