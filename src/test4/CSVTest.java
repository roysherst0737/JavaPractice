package test4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class CSVTest {
	
	public static void main(String[] args) throws IOException {
		// 3. 直接更改java環境的編碼設定 window -> preferences -> general -> workspace -> text file encoding
//		FileReader fr = new FileReader("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\CGA103_Workspace\\javatest\\CSVTest.csv");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String data;
//		while ((data = br.readLine()) != null)
//			System.out.println(data);
//		
//		br.close();
//		fr.close();
		
		
		// 1. 先用位元資料流讀進來, 再進行編碼轉換的設定
		FileInputStream fis = new FileInputStream("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\CGA103_Workspace\\javatest\\CSVTest.csv");
		InputStreamReader isr = new InputStreamReader(fis, "MS950");
		BufferedReader br = new BufferedReader(isr);
		
		String data;
		while ((data = br.readLine()) != null)
			System.out.println(data);
		
		br.close();
		isr.close();
		fis.close();
		
		// 2. 先將文字的位元資料讀進byte[], 再利用字串建構子指定編碼轉換
//		File file = new File("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\CGA103_Workspace\\javatest\\CSVTest.csv");
//		byte[] data = new byte[(int)file.length()];
//		FileInputStream fis = new FileInputStream(file);
//		fis.read(data);
//		
//		String str = new String(data, "MS950");
//		System.out.println(str);
//		fis.close();
	}
}
