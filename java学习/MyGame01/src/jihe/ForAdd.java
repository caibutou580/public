package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

// 增强for 循环练习：
public class ForAdd {
	public static void main(String[] args) {
		show(); 
		list();
	}

	private static void list() {
		// TODO Auto-generated method stub
		int [] look = {12,23,42,64,21,67};
		for (int i : look) {		// 增强for循环只是简单遍历出来，不能以索引操作元素。
									// 所以数组一般使用传统的for循环来操作。
			System.out.println(i);
		}
			
	}

	private static void show() {
		// TODO Auto-generated method stub
		Collection blue = new ArrayList();
		blue.add("sta1");
		blue.add("sta2");
		blue.add("sta3");
		blue.add("sta4");
		
//		for (Object obj : blue) {
//			System.out.println(obj);
//		}
		
		
	}
	
	
}
