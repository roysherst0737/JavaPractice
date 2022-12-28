package test2;

public class Student_Review {
	int score = 90;
	public void play(int hours) {
		score -= hours; 
	}
	public void study(int hours) {
		score += hours;
	}

	public static void main(String[] args) {
		
		Student_Review Tom = new Student_Review();
		Student_Review Jerry = new Student_Review();
		
			
		System.out.println(Tom.score);
		System.out.println(Jerry.score);
			
		Tom.play(2);
		Tom.study(6);			
		Jerry.play(5);
		Jerry.study(2);
		
		System.out.println("==================");
		
		System.out.println(Tom.score);
		System.out.println(Jerry.score);	
		
		
	}
}
