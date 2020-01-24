#### Map接口

​	Map接口，是一种双列集合，它的每一个元素都包括一个键对象Key和一个值对象Value，键和值对象之间存在一种对应关系，称为映射。

案例：取出Map集合中所有元素。【注意】Map接口不能使用迭代器和增强 for 循环。
~~~java
package com.nose.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 取出Map中所有元素
public class putDemo02 {
	public static void main(String[] args) {
		// 创建Map集合，存入元素。

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(2, "zhangsan");
		map.put(3, "lisi");
		map.put(4, "wangwu");
		map.put(5, "zhaosi");
		map.put(6, "tutu");

		// 方法一：	【推荐使用】
//		Set<Integer> set = map.keySet(); // 将map 中所有键取出并存放在set中。
//		for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
//
//			Integer SetK = it.next();	// 取出Map中所有键。
//			String SetV =map.get(SetK);	//取出Map中所有值。
//			
//			System.out.println(SetK + " = " + SetV );

		// 方法二：
		Set<Map.Entry<Integer, String>> set = map.entrySet();
			for (Iterator<Map.Entry<Integer, String>> it = set.iterator(); it.hasNext();) {
				Map.Entry<Integer, String> lock = it.next();
				
				Integer MapK = lock.getKey();	
				String MapV = lock.getValue();
				System.out.println(MapK + "::" + MapV);
             
                // 该方法只能取出Map集合中的值 (因为值可以重复,不能通过值找到键)
		//	Collection<String> vlue = map.values();
		//	for (Iterator<String> it = vlue.iterator(); it.hasNext();) {
		//		String ad =it.next();
		//		System.out.println(ad);
		//	}
				
			}

	}
}
~~~



Map子类:

* Hashtable : 哈希表结构,是同步的,不允许null 键,null 值存在.
* HashMap : 哈希表结构,是不同步的,允许null 键,null 值存在.
* TreeMap : 二叉树结构,是不同步的.可以对Map集合中的加键进行排序.

















 









