package test3;

public class Animal {
	private int age;
	private float weight;
	
	public Animal() {
		//1.保留消失的預設建構子(無參數的)
		//2.做為日後搭配框架(工具)使用，因為框架會幫我們建立物件，呼叫的就是無參數建構子
	}
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("年齡為 " + age + " 歲");
		System.out.println("體重為 " + weight + " 公斤");
	}
	
	//getter/setter
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
