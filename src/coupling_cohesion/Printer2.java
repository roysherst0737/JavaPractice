package coupling_cohesion;

public class Printer2 implements USB {

	@Override
	public void work() {
		System.out.println("列印文件");
	}
}
