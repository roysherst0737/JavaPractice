package homework09;

public class Homework09_01 implements Runnable{
	
	private String name;
	int counter = 1;
	
	public Homework09_01 (String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (counter < 11) {
			System.out.println(name + "吃第" + counter + "碗飯");
			counter++;
			
			if (counter > 10) {
				System.out.println(name + "吃完了！");			
			}
			
			try {
				Thread.sleep((int)(Math.random() * 3000) + 500);
			} catch (Exception e) {
			}
		}		
	}
	
	public static void main(String arg[]) {
		System.out.println("-----大胃王快食比賽開始！-----");
		
		Homework09_01 r1 = new Homework09_01("饅頭人");
		Thread t1 = new Thread(r1);
		Homework09_01 r2 = new Homework09_01("詹姆士");
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}		
		System.out.println("-----大胃王快食比賽結束！-----");
	}
}	
