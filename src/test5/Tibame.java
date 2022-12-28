package test5;

public class Tibame {
	
	public static void main(String[] args) {
		System.out.println("tibame開門了");
		
		Classroom c1 = new Classroom(905, "小吳");
		Classroom c2 = new Classroom(805, "大吳");
		Classroom c3 = new Classroom(901, "郭老");
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		
		System.out.println("tibame關門了");
	}

}