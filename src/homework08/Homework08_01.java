package homework08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework08_01 {
	
	public static void main(String[] args) {
		
		List hw8 = new ArrayList();
		hw8.add(new Integer(100));
		hw8.add(new Double(3.14));
		hw8.add(new Long(21L));
		hw8.add(new Short("100"));
		hw8.add(new Double(5.1));
		hw8.add("Kitty");
		hw8.add(new Integer(100));
		hw8.add(new Object());
		hw8.add("Snoopy");
		hw8.add(new BigInteger("1000"));
		
		// 1.使用Iterator印出
		System.out.println("===用Iterator===");
		Iterator it = hw8.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		
		// 2.使用傳統for迴圈印出
		System.out.println("===用傳統for===");
		for (int i = 0; i < hw8.size(); i++) {
			System.out.println(hw8.get(i));
		}
		
		// 3.使用for each印出
		System.out.println("===用for each===");
		for (Object obj : hw8) {
			System.out.println(obj);
		}
		
		// 移除不是java.lang.Number相關的物件後印出
		System.out.println("===移除非Number相關物件後印出===");
		for (Object obj : hw8) {
			if (obj instanceof Number)
			System.out.println(obj);
		}		
	}
}
