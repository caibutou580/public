package PlaneGame1_0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import jihe.book;

public class Books {
	public static void main(String[] args) {
		Object look= cook();
		
	}

	private static Object cook() {
		
		// 创建Set容器，存入元素；
		Set set = new TreeSet(new bijiao()); // 有序排列
		
		set.add(new book("xiaoqiang",23));
		set.add(new book("zhangsan",20));
		set.add(new book("lisi",23));
		set.add(new book("lisi",23));
		set.add(new book("wangwu",18));
		set.add(new book("laowang",23));
		set.add(new book("xiaoli",23));
		set.add(new book("haha",23));
		set.add(new book("xiaoli",20));
		set.add(new book("haha",23));
	
		kit(set);
		
//		System.out.println(set);
		return set;
	}

	private static void kit(Set set) {
		// 取出元素
		for (Iterator it = set.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			System.out.println(obj);
		}
		
	}

}
