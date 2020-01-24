package jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 去除集合中相同元素；
 * 
 * 思路：1、创建集合容器，并添加元素。
 * 	2、创建空容器，利用迭代器遍历原集合容器中的元素，并比较空容器中是否存在该元素，若不存在则添加该元素，若存在则不添加。
 *
 * */

public class pass {
	
	
	
	public static void main(String[] args) {
		 Object add = sta();
		 System.out.println(add);
	}

	private static Object sta() {
		// 创建集合容器
		
		List bort = new ArrayList();
		
		bort.add("sta1");
		bort.add("sta2");
		bort.add("sta1");
		bort.add("sta3");
		bort.add("sta4");
		bort.add("sta3");
		bort.add("sta3");
		bort.add("sta2");
		
		Object ste= hand(bort);
		
		return ste;
	}

	private static Object hand(List bort) {
		// 创建空容器，并进行比较
		List cake = new ArrayList();
		
	
		for (Iterator it = bort.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			if(!cake.contains(obj)) {
				cake.add(obj);
			}
			
		}
		return cake;	
	}
}
