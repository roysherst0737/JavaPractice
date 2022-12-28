package test3;

public class WeightTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Plane plane = new Plane();
		Powder powder = new Powder();
		
		Weightable[] ws = new Weightable[3];
		ws[0] = dog;
		ws[1] = plane;
		ws[2] = powder;
		
		for (int i = 0; i < ws.length; i++) {
	    	ws[i].getWeightTool();
	    	System.out.println("=============");
	    }
		
//		Weightable[] a = new Weightable[3];
//		a[0] = new Powder();
//		a[1] = new Plane();
//		a[2] = new Dog();
//	    
//	    for (int i = 0; i < a.length; i++) {
//	    	a[i].getWeightTool();
//	    	System.out.println("=============");
//	    }
	}
}
