package homework05;

public class MyRectangleMain {
	
	public static void main (String[] args) {
		
		MyRectangle R1 = new MyRectangle();
		R1.setWidth(10);
		R1.setDepth(20);
		System.out.println(R1.getArea());
		
		MyRectangle R2 = new MyRectangle(10, 20);
		System.out.println(R2.getArea());
	}
	

}
