package homework05;

public class Homework05_05 {

	public void genAuthCode() {

		String code = "";
		for (int i = 0; i < 8; i++) {
			while (true) {
				int rand = (int) (Math.random() * 123);
				if ((rand >= 48 && rand <= 57) || (rand >= 65 && rand <= 90) || (rand >= 97 && rand <= 122)) {
					code +=(char) rand;
					break;
				}
			}
		}
		System.out.println(code);
	}
	
	public static void main(String[] args) {
		Homework05_05 hw5= new Homework05_05();
		System.out.println("本次隨機產生驗證碼為:");
		hw5.genAuthCode();
	}
}
