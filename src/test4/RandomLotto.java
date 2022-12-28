package test4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class RandomLotto {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("威力彩自動選號");
//		Set set = new HashSet();
		@SuppressWarnings("rawtypes")
		Set set = new TreeSet();
		while ( set.size() != 6 ) {
			int r1 = (int)(Math.random() * 38) + 1;
			set.add(r1);
		}
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " " );
		}
		System.out.println("\n特別號：" + ((int)(Math.random() * 8) + 1));
	}
}


