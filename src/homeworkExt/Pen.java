package homeworkExt;

public class Pen {
	
	private String brand;
	private double price;

	public Pen () {};
	
	public Pen (String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Pen(String brand) {
		this(brand, 0);
	}
	
	public Pen(double price) {
		this("-", 0);
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
	
	public void write() {};
}
