package working;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import works.showing;
import works.soupman;

// 将person 对象存储到TreeSet集合中，同姓名同年龄视为同一人，不存，姓名升序排列为自然数
/*
 * 思路：1、创建容器对象，并加入对象元素。
 * 	2、实现Comparato接口，并改写Comparable（自然排序）；
 * 
 * */

public class man {
	public static void main(String[] args) {
		Object oup= grape();
		System.out.println(oup);
	}

	private static Object grape() {
		// 创建容器，添加元素
		Set set = new TreeSet(new showing());
		
		set.add(new soupman("张三",12));
		set.add(new soupman("lisi",12));
		set.add(new soupman("wangwu",12));
		set.add(new soupman("张三",12));
		set.add(new soupman("lisi",22));
		set.add(new soupman("lisi",22));
		set.add(new soupman("张三",33));
		set.add(new soupman("张三",33));
		set.add(new soupman("张三",33));
		
		for (Iterator it = set.iterator(); it.hasNext();) {
			Object obj =it.next();
		
		}
	
		return set;
	}

}
