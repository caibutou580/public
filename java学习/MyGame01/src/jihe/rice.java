package jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 定义功能，去除ArrayList集合中重复元素；
/*
 * 思路：1、创建多个对象。
 * 	2、创建集合容器，将对象添加进来。
 * 	3、定义功能，将容器中重复元素删除。
 * 
 * */

public class rice {
	public static void main(String[] args) {
		toshow();

	}

	private static void toshow() {

		List knife = new ArrayList();

		knife.add("ata1");
		knife.add("ata3");
		knife.add("ata1");
		knife.add("ata1");
		knife.add("ata3");
		knife.add("ata4");
		knife.add("ata3");
		knife.add("ata2");
		knife.add("ata4");
		knife.add("ata3");

		System.out.println(knife);

//		find(knife);
		Object hub = grammer(knife);
		
		System.out.println(hub);
	}

	
	// 方法一：
//	private static void find(List knife) {
//
//		for (int i = 0; i < knife.size() - 1; i++) {
//			Object x = knife.get(i);
//		
//			for (int j = i+1; j < knife.size(); j++) {
//				if (x.equals(knife.get(j))) {
//					knife.remove(j);
//					j--;
//				}
//
//			}
//
//		}
//
//	}
	
	
	// 方法二：
	/*
	 * 思路： 创建一个空容器，将原容器元素遍历，遍历的同时与空容器比较，若空容器中不包含原容器元素，则将该元素加入，若已存在则不加入。
	 * */
	public static Object grammer(List knife) {
		// 创建空容器 
		List voids = new ArrayList();
		
		// 使用迭代器遍历
		for (Iterator it = knife.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			System.out.println(obj);
			// 判断空容器是否包含原容器中的元素
			if(!voids.contains(obj)) {
				voids.add(obj);
			}
		
		}
		return voids;
	}
	

}
