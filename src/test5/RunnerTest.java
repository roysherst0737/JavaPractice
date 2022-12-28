package test5;

public class RunnerTest {
	private int data = 10;
	
	public static void main(String[] args) {
		RunnerTest rt = new RunnerTest();
		rt.go();
	}
	
	// Lambda expression (在此例狀況，有一個類別只為了實作Runnable介面(要用run方法)，可以用Lambda敘述來省略類別
	public void go() {
		Thread t1 = new Thread(() -> { System.out.println("Runner got " + data); // 若只有一行敘述，大括號可省略
									   System.out.println("Lambda 可以用大括號代表區塊"); //注意：若多於一行敘述，一訂要加大括號
									 });
		t1.start();
	}
}