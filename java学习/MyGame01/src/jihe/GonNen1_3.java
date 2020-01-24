package jihe;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
/*
 *集合（Collection）部分功能
 * 
 */

public class GonNen1_3 {
	
	public static void main(String[] args) {
		Collection set = new Vector(); // 注意 Collection为接口（抽象类）不能实例化，所以通过Vector实现该接口
//		staDemo(set);
		
		staDemo();
		
		
	}

	private static void staDemo() {
		Collection c1 = new Vector();
		Collection c2 = new Vector();
		
		c1.add("sta1");
		c1.add("sta2");
		c1.add("sta4");
		
		c2.add("sta4");
		c2.add("sta7");
		c2.add("sta2");
		
		
//		// 演示All的功能。
//		// 1、将c2中的元素全部添加进c1中；
//		c1.addAll(c2);
//		System.out.println(c1); // [sta1, sta2, sta4, sta4, sta7, sta2]
//
//		// 2、删除功能。
//		c1.removeAll(c2);	// 删除c1中包含c2 的全部元素 
//		System.out.println(c1);	// [sta1]
		
		// 删除c1和c2中不相同的元素，保留c1和c2相同的元素
//		c1.retainAll(c2);
//		System.out.println(c1); //[sta2, sta4]		
		
//		// 3、判断。
//		System.out.println(c1.containsAll(c2)); // false
					
	}

	private static void staDemo(Collection set) {
		// 功能演示
		// 1、添加功能；
		set.add("sta1");
		set.add("sta2");
		set.add("sta3");
		System.out.println(set.size()); // 3 
	
		
		// 2、删除功能。
		set.remove("sta1");
		System.out.println(set.toString());  // [sta2, sta3]
		
		// 3、判断
		System.out.println(set.contains("sta3"));  // true	
		
	}
	
}
