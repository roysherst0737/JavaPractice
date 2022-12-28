package homeworkExt;

public class InkBrush extends Pen {

	@Override
	public void write() {
		super.write();
		System.out.println("沾墨汁再寫");
	}
	
	public InkBrush(String brand, double price) {
		super(brand, price * 0.9);
	};
	
	public static void main (String[] args) {
		InkBrush i = new InkBrush("萬寶龍", 100000);
		i.write();
		double price = i.getPrice();
		System.out.println(price);
	}

}
