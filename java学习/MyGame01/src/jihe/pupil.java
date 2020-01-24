package jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PlaneGame1_0.ClassRoom;

public class pupil {
	public static void main(String[] args) {
		Object kit = set();
		System.out.println(kit);
	}

	/*
	 * 去除集合中重复元素案例：
	 * 
	 */

	private static Object set() {
		// 创建集合容器，存入元素
		List push = new ArrayList();
		ClassRoom p1 = new ClassRoom("张三", 13);
		ClassRoom p2 = new ClassRoom("张三", 13);
		ClassRoom p3 = new ClassRoom("张三", 13);
		ClassRoom p4 = new ClassRoom("李四", 12);
		ClassRoom p5 = new ClassRoom("王五", 13);
		ClassRoom p6 = new ClassRoom("李四", 13);
		ClassRoom p7 = new ClassRoom("王五", 13);
		ClassRoom p8 = new ClassRoom("张三", 13);
		push.add(p1);
		push.add(p2);
		push.add(p3);
		push.add(p4);
		push.add(p5);
		push.add(p6);
		push.add(p7);
		push.add(p8);

		Object like = find(push);
	
		return like;

	}

//private static Object find(List push) {
//	// TODO Auto-generated method stub
//	return null;
//}

	public static Object find(List push) {
		// 创建空容器，并判断；

		List pull = new ArrayList();
		for (Iterator it = push.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			if (!pull.contains(obj)) {
				pull.add(obj);
			}
			

		}
		return pull;
	}


}
