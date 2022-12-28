package homework07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework07_01 {
	/**
	 *  請寫一個程式讀取Sample.txt檔案，並輸出以下訊息：
	 *  Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
	 */
	
	public static void main (String[] args) {
		
		try {
			File f = new File("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\JavaPracticeFiles\\Homework Content\\Homework7\\Sample.txt");
			FileReader fr1 = new FileReader(f);
			FileReader fr2 = new FileReader(f);
            BufferedReader br1 = new BufferedReader(fr1) ;
            BufferedReader br2 = new BufferedReader(fr2) ;
            
            int byteNum = 0, charNum = 0, line = 0;
            
            byteNum = (int) f.length(); // 檔案的長度就是位元數
            
            while (fr1.read() != -1) {  // 讀取檔案，讀到沒有字元時跳出迴圈
            	charNum++;
            }
            
            while (br2.readLine() != null) { // 讀取檔案，讀到沒有行列時跳出迴圈
            	line++;
            }
            
            System.out.println("Sample.txt檔案共有" + byteNum + "個位元組，" + charNum + "個字元，" + line + "列資料");

            br2.close();
            br1.close();
            fr2.close();
            fr1.close(); 

        } catch(IOException e){}
	}
}
