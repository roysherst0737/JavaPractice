package test1;

public class BMI_PracticeReview {

	public static void main(String[] args) {
		int weight = 80;
		double height = 1.8;
		double bmi = weight/(height*height);
		System.out.println("BMI是" + bmi);
		System.out.printf("BMI是%.2f%n", bmi);
		
		if (bmi < 18.5) {
			System.out.println("過瘦");
		}else if (bmi>=18.5 && bmi<24) {
			System.out.println("正常");
		}else {
			System.out.println("過重");					
				}
			}
}
