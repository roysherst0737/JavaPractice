package test2;

public class HelloArray {

	public static void main(String[] args) { //main方法本身就有一個字串陣列(Sring[] args)
//		int s1 = 100, s2 = 100, s3 = 95, s4 = 97;
//		int sum = s1 + s2 + s3 + s4;
//      太多變數打太多次，麻煩！
		
		          //index  0    1   2   3     Index(索引)，從0開始，可當作「位置」(Posistion)
		int[] scores1 = { 100, 100, 95, 97 }; //在陣列裡的資料被稱為 「元素」(element)，有順序性
		
		int[] scores2 = new int[4]; //在陣列裡的數字，為所需記憶體空間大小(有四個int)	,必須指定長度且不可再更改
		scores2[0] = 100;           //若還不知資料，可以用此方式先標示索引值
		scores2[1] = 100;
		scores2[2] = 95;
		scores2[3] = 97;
		
//		int sum2 = scores1[0] + scores1[1] + scores1[2] + scores1[3]; →此方式不好，應要用迴圈的方式(重複取出資料)
		
		for (int i = 0; i < scores1.length; i++)
			System.out.println(scores1[i]);
	}

}
