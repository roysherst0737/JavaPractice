package test3;

public class WrapperClass {

	public static void main(String[] args) {
		
		@SuppressWarnings("removal")
		Integer i1 = new Integer(10); //JDK9 後不建議此用法
		@SuppressWarnings("removal")
		Integer i2 = new Integer(10); //JDK9 後不建議此用法
		
		Integer i3 = Integer.valueOf(10); //JDK9 後用此static方法
		Integer i4 = Integer.valueOf(10); //JDK9 後用此static方法
		
		System.out.println(i1 == i2); //f, 因為不同位址
		System.out.println(i1.equals(i2)); //t, 因為包裝類別的equals方法都改寫過了
		
		System.out.println(i3 == i4);
		
		int i5 = i3.intValue();
		System.out.println(i5);
		
		String s1 = "100";
		int data = Integer.parseInt(s1);
		System.out.println(s1 + 100);
		System.out.println(data + 100);

	}

}
