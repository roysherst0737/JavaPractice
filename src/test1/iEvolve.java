package test1;

public class iEvolve {
	public static void main(String[] args) {
//		String a = "ABCD";
		String a = new String("ABCD");
		String b = a.toLowerCase();
		String Ans = b.replace('a', 'd').replace('b', 'n');
		Ans.replace('B', 'n');
//		a.replace('B', 'c');
		System.out.println(Ans);		
	}
}