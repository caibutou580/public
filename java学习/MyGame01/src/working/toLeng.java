package working;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import works.ppp;

// 对多个字符串（不重复）按照长度排列（有短到长）

/*
 * 思路： 不重复（Set）
 * 
 * 排列（实现接口）
 * */

public class toLeng {
	public static void main(String[] args) {
		Object have = has();
	}

	private static Object has() {
		Set set = new TreeSet(new ppp());
		
		set.add("haha");
		set.add("computer");
		set.add("sd");
		set.add("xiaoming");
		
		for (Iterator it = set.iterator(); it.hasNext();) {
			Object obj =it.next();
			System.out.println(obj);
			
		}

		return null;
	}

}

