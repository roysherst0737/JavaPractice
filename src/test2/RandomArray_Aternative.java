package test2;

public class RandomArray_Aternative {
	
	public static void main (String[] args) {
		RandomArray_Aternative tra = new RandomArray_Aternative();
		int[][] X = tra.getRandomArray();
		int[][] Y = tra.getRandomArray();
		int[][] Z = new int[3][3];
		
		for (int i = 0; i < Z.length; i++) {
			for(int j = 0; j < Z[i].length; j++) {
				Z[i][j] = X[i][j] + Y[i][j];
			}
		}
		
		tra.printArray(X);
		tra.printArray(X);
		tra.printArray(X);
	}
	
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++ ) {
				data[i][j] = (int)(Math.random() * 31);
			}
		}
		return data;
	}
	
	public void printArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j<data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=========================");
		
		
	}

}
