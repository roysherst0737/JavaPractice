package test5;

import java.util.Comparator;

public class MyCmparartor implements Comparator<Integer> {
	
	public int compare(Integer i1, Integer i2) {
		
		return i1 - i2; //用此變數即可替代下方if...else方法
		
//		if (i1 > i2) {
//			return 1;
//		} else if (i1 == i2) {
//			return 0;
//		} else {
//			return -1;
//		}
	}
}
