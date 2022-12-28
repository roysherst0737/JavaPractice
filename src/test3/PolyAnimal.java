package test3;

public class PolyAnimal {

	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		a[0] = new Elephant(10, 2500.0f, "大象");
		a[1] = new Animal(2, 5.0f);
		a[2] = new Elephant(100, 500.0f, "烏龜");
	    
	    for (int i = 0; i < a.length; i++) {
	    	a[i].speak();
	    	System.out.println("=============");
	    	
	    }
	}

}
