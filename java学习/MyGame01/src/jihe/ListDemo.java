package jihe;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// list集合练习

public class ListDemo {
	public static void main(String[] args) {
		List lst = new Vector();
		com(lst);
		
	}

	private static void com(List lst) {
		// 添加元素(对象)
		lst.add("abc1");
		lst.add("abc2");
		lst.add("abc3");
		
		// 插入元素(对象)
		lst.add(1,"hello");
//		System.out.println(lst);
		
		// 删除元素(对象)
		lst.remove("abc1");	// 根据元素(对象)删除
		lst.remove(2);	// 根据索引删除
//		System.out.println(lst);
		
		// 获取元素(对象)
		lst.get(1);
		lst.indexOf("hello");
//		System.out.println(lst.get(1));	 // 获取元素(对象)
//		System.out.println(lst.indexOf("hello"));	// 获取 索引
		
	
		// 取出 集合中所有元素
		for (Iterator it = lst.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
		
	}

}
