package homework07;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Homework07_05 {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Roy\\OneDrive\\文件\\1.TibaMe\\1.CodingClass\\1.Java\\JavaPracticeFiles\\javatest\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
			((Cat) ois.readObject()).speak();
			((Cat) ois.readObject()).speak();
			((Dog) ois.readObject()).speak();
			((Dog) ois.readObject()).speak();
	}
}
