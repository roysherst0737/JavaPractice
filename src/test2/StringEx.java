package test2;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println(s1 == s2); //比較記憶體位址(s1與s2的位址相同(字串池))
		System.out.println(s1 == s3); //因為s3為新的物件，位址不同！
		
		System.out.println("==========");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
