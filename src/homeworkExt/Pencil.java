package homeworkExt;

public class Pencil extends Pen{
	
	@Override
	public void write() {
		super.write();
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil(String brand, double price) {
		super(brand, price * 0.8);
	};
	
	public static void main (String[] args) {
		Pencil i = new Pencil("Pentel", 10);
		i.write();
		double price = i.getPrice();
		System.out.println(price);
	}

}
