package test1;

public class BMI_Practice1 {
	
	public static void main(String[] args) {
	
		//step 1: 宣告變數來存身高跟體重
		int myWeight = 80;
		double myHeight = 1.79;
		
		//step 2:運算獲得BMI並顯示出來
		double BMI = myWeight/(myHeight * myHeight);
		
		System.out.println("BMI = " + BMI);
		System.out.printf("BMI = %.2f%n", BMI);
		
		//step 3:根據BMI坐落在哪個範圍，並標示出來
		if (BMI <18.5) {
			System.out.println("過瘦");
		}else if(BMI>=18.5 && BMI<24) {
			System.out.println("正常");
		}else {
			System.out.println("過重");
		}
	}
}