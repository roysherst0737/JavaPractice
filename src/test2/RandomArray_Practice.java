package test2;

public class RandomArray_Practice {

	public static void main(String[] args) {
		//Step 1: 建立三個3x3的二維陣列
		int[][] X = new int[3][3];
		int[][] Y = new int[3][3];
		int[][] Z = new int[3][3];
		
		//Step 2: 把亂數資料加入到X陣列(用巢狀迴圈)
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j <X[i].length; j++) {
				X[i][j] = (int)(Math.random()*31);
			}
		}

		//Step 3: 把亂數資料加入到Y陣列(用巢狀迴圈)
		for (int i = 0; i < Y.length; i++) {
			for (int j = 0; j <Y[i].length; j++) {
				Y[i][j] = (int)(Math.random()*31);
			}
		}
		
		//Step 4: 把X, Y對應位置的元素加總後放到Z對應的位置裡
		for (int i = 0; i <Z.length; i++) {
			for (int j = 0; j < Z[i].length; j++) {
				Z[i][j] = X[i][j] + Y[i][j];
			}
		}
		
		//Step 5:把三個陣列的元素都列印顯示出來觀察
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[i].length; j++) {
				System.out.print(X[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=======================");
		
		for (int i = 0; i < Y.length; i++) {
			for (int j = 0; j <Y[i].length; j++) {
				System.out.print(Y[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=======================");
		
		for (int i = 0; i < Z.length; i++) {
			for (int j = 0; j <Z[i].length; j++) {
				System.out.print(Z[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=======================");
	}

}
