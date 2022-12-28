package test2;

public class Student {
	int score = 90;
	
	public void play(int hours) {
		score = score - hours; //score -= hours;
	}
				
	
	public void study(int hours) {
		score += hours;
	}
	
	public static void main (String[] args) {
		Student David = new Student();
		Student James = new Student();
		
		System.out.println(David.score);
		System.out.println(James.score);
		
		David.play(2);
		David.study(6);
		
		James.play(5);
		James.study(2);
		
		System.out.println("=======");
		
		System.out.println(David.score);
		System.out.println(James.score);
		
	}
}
