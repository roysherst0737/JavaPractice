package homework07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Homework07_04 {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\JavaPracticeFiles\\javatest\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}

		File file = new File("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\JavaPracticeFiles\\javatest\\data\\Object.ser");
		Object[] obj = new Object[4];
		obj[0] = new Cat("Tommycat");
		obj[1] = new Cat("Garfieldcat");
		obj[2] = new Dog("Lassiedog");
		obj[3] = new Dog("Watchdog");
		
	try {
        FileOutputStream fos = new FileOutputStream(file); 
        ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < obj.length; i++) {
			oos.writeObject(obj[i]);
		}
		
		fos.close();
		oos.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
