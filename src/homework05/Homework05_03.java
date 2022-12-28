package homework05;

import java.util.Arrays;

// 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
// 可以找出二維陣列的最大值並回傳
public class Homework05_03 {
	public int maxElement(int [][] intArray) {
		int a = intArray.length;
		int[] x = new int[a];
		for (int i = 0; i < a; i++) {
			Arrays.sort(intArray[i]);
			x[i] = intArray[i][a];
		}
		return x[x.length - 1];
	}
	
	public double maxElement(double [][] doubleArray) {
		int b = doubleArray.length;
		double[] y = new double[(int) b];
		for (int i = 0; i < b; i++) {
			Arrays.sort(doubleArray[i]);
			y[i] = doubleArray[i][(int) b];
		}
		return y[y.length - 1];
	}
	
	public static void main (String[] args) {
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		Homework05_03 W = new Homework05_03();
		System.out.println(W.maxElement(intArray));
		System.out.println(W.maxElement(doubleArray));
	}
}
