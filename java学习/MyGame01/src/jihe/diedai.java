package jihe;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Collector;

// 迭代器练习

public class diedai {
	public static void main(String[] args) {
		str();
	}

	private static void str() {
		Collection c = new Vector();
			c.add("abc1");
			c.add("abc2");
			c.add("abc3");
			
		// 获取容器迭代器。
//			Iterator yy =c.iterator();
			
//			//next() 方法：返回迭代的下一个元素	
//			System.out.println(yy.next()); // abc1
//			System.out.println(yy.next()); // abc2
//			System.out.println(yy.next()); // abc3
//			System.out.println(yy.next()); // java.util.NoSuchElementException （ 异常 ）
			
			// 方法一：
//			while (yy.hasNext()) {
//				System.out.println(yy.next());
//				
//			}
			
			// 开发模式：好处：该功能结束后，迭代对象消失（不在内存中）
//			for (Iterator yy = c.iterator(); yy.hasNext();) {
//				System.out.println(yy.next());
//				
//			}
	}
}
