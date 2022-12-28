package homework08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class homework08_02 {
	
	public static void main(String[] args) {
		homework08_02 hw8_2 = new homework08_02();
		System.out.println("===印出不重複的Train物件===");
		hw8_2.nonRepeat();
		System.out.println("===以班次編號由大到小印出===");
		hw8_2.SortbyId();
		System.out.println("===讓班次編號由大排到小印出， 還可以不重複印出===");
		hw8_2.SortandNonrepeat();
	}
	
	public void nonRepeat() {
		Set<Train> set = new HashSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		// 傳統for迴圈
		System.out.println("---set無法用傳統for迴圈---");
//		for (int i= 0; i < set.size(); i++) {
//			System.out.println(set.get(i)); 
//		}	
		
		// for each
		System.out.println("---用for each---");
		for (Train t : set) {
			System.out.println(t.printInfo());
		}
		
		// Iterator
		System.out.println("---用Iterator---");
		Iterator<Train> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().printInfo());
		}
	}
	
	public void SortbyId() {
		List<Train> list = new ArrayList<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		Collections.sort(list);
		
		// 傳統for迴圈
		System.out.println("---傳統for迴圈---");
		for (int i= 0; i < list.size(); i++) {
			System.out.println(list.get(i).printInfo()); 
		}				
		
		// for each
		System.out.println("---用for each---");
		for (Train t : list) {
			System.out.println(t.printInfo());
		}
		
		// Iterator
		System.out.println("---用Iterator---");
		Iterator<Train> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().printInfo());
		}
	}
	
	public void SortandNonrepeat() {
		Set<Train> set = new TreeSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		// 傳統for迴圈
		System.out.println("---set無法用傳統for迴圈---");
//		for (int i= 0; i < set.size(); i++) {
//			System.out.println(set.get(i)); 
//		}				
		
		// for each
		System.out.println("---用for each---");
		for (Train t : set) {
			System.out.println(t.printInfo());
		}
		
		// Iterator
		System.out.println("---用Iterator---");
		Iterator<Train> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().printInfo());
		}
	}
}
