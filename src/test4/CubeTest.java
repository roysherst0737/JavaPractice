package test4;

public class CubeTest {

	public static void main(String[] args) {
		
		try {
//			Cube c1 = new Cube(-5);
//			System.out.println(c1.getVolume());
			
			Cube c2 = new Cube();
			c2.setLength(9);
			System.out.println(c2.getVolume());
			
		} catch (CubeException ce) {
			ce.printStackTrace();
		}
		
	}

}
