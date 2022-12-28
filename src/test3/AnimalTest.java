package test3;

public class AnimalTest {

	public static void main(String[] args) {
		Animal puppy = new Animal(2, 5.0f);
		puppy.speak();
		
//		System.out.println("===轉眼三年過去===");
//		
//		puppy.age = 5;
//		puppy.weight = 25.0f;
//      puppy.Animal(5, 25.0f);
//		
//		puppy = new Animal(5, 25.0f);
//		puppy.speak();                建構子只能設一次，所以這樣會是不同的狗狗
//		所以要用setter/getter
//		
//		puppy.setAge(5);
//		puppy.setWeight(25.0f);
//		puppy.speak();         //這樣用setter&getter才會是同一隻狗狗
	
		Animal a1 = new Animal(3, 8.0f);
		Elephant e1 = new Elephant(8, 1200.0f, "大象");
		a1.speak();
		e1.speak();
	
	}

}
