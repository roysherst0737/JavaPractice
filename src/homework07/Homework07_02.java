package homework07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Homework07_02 {
	public static void main (String[] args) throws IOException {
		try {
			int num;
			String str = "";
			File data = new File("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\2.Workspaces\\EclipseWorkspace\\BasicJava\\JavaPractice\\src\\homework07\\Data.txt");
			FileOutputStream fos = new FileOutputStream(data, true);
			PrintWriter pw = new PrintWriter(fos, true);

			for (int i = 1; i <= 10; i++) {
				num = (int) (Math.random() * 1000 + 1);
				str += num + "\t";
			}
			System.out.println("已存進一筆亂數資料進入Data.txt");
			pw.println(str);

			pw.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


