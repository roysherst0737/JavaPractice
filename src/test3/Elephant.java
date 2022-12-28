package test3;

public class Elephant extends Animal {
	
	private String name;
	
	public Elephant() {
		//保留省略的預設建構子(這段是可省略的，Java會幫我們自動加上)
	}
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	//此方法編譯不會報錯，被編譯器當作overloading(一個是speak(int data),一個是父親別的speak())
//	public void speak() {
//		super.speak();
//		System.out.println("名字叫做" + name);
//	}
	
	//此標註是給編譯氣看的資訊
	//讓編譯器對此方法是以override規則去檢查，所以就能更安全完成覆寫操作
    @Override  // JDK 5 (Annotation) 標註 : 給Java相關工具看的資訊 (例如編譯器, 框架)
	public void speak() {
		super.speak();
		System.out.println("名字叫做" + name);
	}
}
