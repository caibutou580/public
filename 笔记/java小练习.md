#### 1、接口练习（电脑USB）

~~~java
// 定义规则 ( 接口形式 ):
interface USB{
	public void open(); // 开启功能
	public void close();	//关闭功能
}

// 购买符合规则的设备
class Mouse1 implements USB{
	public void open() {
		System.out.println("run open");
	}
	
	public void close() {
		System.out.println("run close");
	}
	
}

class Notebook{ 
	void run() {
		System.out.println("notebook run");
	}
	
	// 符合规则的外部设备
	public void yUSB(USB usb) {
		if(usb!=null) {
			usb.open();
			usb.close();
		}
	}
	
}


public class Notebook_usb {
	public static void main(String[] args) {
		Notebook book = new Notebook();
			book.run();
			book.yUSB(new Mouse1());	// 插上设备
	}
}

~~~



#### 2、StringBuffer 练习：

~~~java
//  通过缓冲区，将要打印的矩形成元素*进行存储后，一次性返回，并输出；

//

public class children {

	public static void main(String[] args) {
		int[] z= {1,2,3,2,3,4,453,7,8,24,2,51234,};
		System.out.println(hat(z));
	}

	public static String cap(int m, int z) {
		StringBuffer sb = new StringBuffer();

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < z; y++) {

				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

// 将int数组转换为字符串 ，为[12,44,23]格式。

	// 方法一：
	public static String small(int[] arr) {
		String set = "[";
		for (int s = 0; s < arr.length; s++) {
			if (s != arr.length-1) {
				set = set + arr[s] + " ,";
			} else {
				set = set + arr[s] + "]";
			}
			
		}
		return set;
	}
	
	//方法二： 利用StringBuffer
	
	public static String hat(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1) {
				sb.append(arr[i]+", ");
			}else {
				sb.append(arr[i]+"]");
			}
		}
		
		return sb.toString();
		
	}

}
~~~



#### 3、day17  基本类型包装类练习：

~~~java
import java.lang.reflect.Array;
import java.util.Arrays;

//将字符串"2 5 4 66 45 98 6 56 75" 升序排列，并以字符串形式返回
/*
 * 1、String >> String[]
 * 2、String[] >> int []
 * 3、 对int 数组排序
 * 4、int[] >> String
 * 
 * */
public class Demo01 {
	public static void main(String[] args) {
		String sta="2 5 4 66 45 98 6 -6 -56 75";
		String dta = toStr(sta);
		System.out.println(dta);
		
	}

	private static String toStr(String sta) {
		//1、String >> String[]
		String[] set = Str(sta);
		
		//2、String[] >> int []
		int [] kite = toIntArr(set);
		
		//3、 对int 数组排序
		sort(kite);
		
		//4、int[] >> String
		String ppp = toIntStr(kite);
		
		
		return ppp;
	}

	private static String toIntStr(int[] kite) {
		// 第四步： int[] >> String
		StringBuffer sb = new StringBuffer(); 
		
		for (int i = 0; i < kite.length; i++) {
			if(i!=kite[i]) {
				sb.append(kite[i]+" ");
			}else {
				sb.append(kite[i]);
			}
		}
		

		return sb.toString();
	}

	private static void sort(int[] kite) {
		//数组排序
		Arrays.sort(kite);
		
	}

	private static int[] toIntArr(String[] set) {
		// 第二部：String[] >> int []
		
		int [] Arr = new int[set.length];
		for (int i = 0; i < Arr.length; i++) {
			Arr[i]=Integer.parseInt(set[i]);
		}
		
		return Arr;
	}

	private static String[] Str(String sta) {
		// 第一步：String >> String[]
		String[] bot =sta.split(" ");
		return bot;
	}
	

}
~~~



#### 4、List 集合练习

~~~java
// 第一部分：
package com.Javas;

// 描述farmer
public class farmer {
	private String name;
	private int age;
	
	
	public farmer() {	// 无参构造
		
	}
	
	public farmer(String name, int age) { // 有参数构造
	
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// 重写toString 
	@Override
	public String toString() {
		return "farmer [name=" + name + ", age=" + age + "]";
	}
	
}

// 第二部分：

package day10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.Javas.farmer;

// 往ArrayList中存储自定义对象。

public class pear {
	/*
	 *思路：1，描述farmer
	 *	2、定义容器
	 *	3、将多个farmer对象存入容器中
	 *	4、取出farmer对象 
	 */
	public static void main(String[] args) {
		
		farmer f1 = new farmer();
			f1.setAge(11);
			f1.setName("zhangsan1");
		
		farmer f2 =new farmer();
			f2.setName("lisi1");
			f2.setAge(12);
		
		// 定义容器：
		List d = new ArrayList();
		
		//将多个farmer对象存入容器中
		d.add(f1);
		d.add(f2);
		d.add(new farmer("zhangsan2",34));
		
		// 取出farmer对象
		for (Iterator it = d.iterator(); it.hasNext();) {
			Object obj = it.next();
			System.out.println(obj.toString());	
		}
		
		for (Iterator st = d.iterator(); st.hasNext();) {
//			Object obj =  st.next();
			farmer ot = (farmer) st.next(); // 【注意】：取出的元素都是Object类型。需要具体对象内容时，需要向下转型。
			
			System.out.println(ot.getName());
			System.out.println(ot.getAge());	
		}
				
	}

}
~~~



#### 5、去除集合中相同元素。【重点了解】

例一：

~~~java
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
~~~



例二：

~~~java
package PlaneGame1_0;

public class ClassRoom {
	private String name;
	private int age;

	public ClassRoom() { // 无参构造
		super();

	}

	public ClassRoom(String name, int age) { // 有参构造
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
//【覆写】
    
	// 覆写 equals 方法,建立pupil类自己判断对象是否相同的依据

	public boolean equals(Object xxx) {
		if (!(xxx instanceof ClassRoom)) {// 判断类型是否相同

		}
		// 强转
		ClassRoom p = (ClassRoom) xxx;
		return this.name.equals(p.name) && this.age == p.age;
	}


//	
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", age=" + age + "]";
	}

}

====================================================================================================
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
~~~



#### 6、对多个字符串（不重复）按照长度排列（有短到长）

~~~java
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

====================================================================================================

package works;

import java.util.Comparator;

public class ppp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// 向下转型
		String s1 = (String) o1;
		String s2 = (String) o2;
		
		//按照长度排列（有短到长）
		int temp =s1.length()-s2.length(); 

		return temp==0?s1.compareTo(s2):temp;
	}
}

~~~

#### 7、HashSet集合经典例题：

假设，年龄相同则为同一人（不存）。

假设，姓名相同则为同一人（不存）。 【被注释】

~~~java
package works;

import java.util.Comparator;

public class wow {
	private String name;
	private int age;

	public wow(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public wow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "wow [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return 0;
//		return result;
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		wow other = (wow) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;

		if (this == obj)
			return true;
		if (!(obj instanceof Object))
			return false;
		wow str = (wow) obj;

         // 年龄相同	
		boolean b = this.age == str.age; 
        
        // 姓名相同
//		boolean b = this.name.equals(str.name);
		return b;
	}

}
====================================================================================================

package working;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import works.wow;

// 泛型小练习

public class bread {
	public static void main(String[] args) {
		juice();
	}

	private static void juice() {
		// 创建容器
//		List<wow> cat =new ArrayList<wow>();

//		Set<wow> cat = new TreeSet<wow>(new plate());

		Set<wow> cat = new HashSet<wow>();

		cat.add(new wow("haha", 30));
		cat.add(new wow("nbaaa", 23));
		cat.add(new wow("hello", 21));
		cat.add(new wow("python", 10));
		cat.add(new wow("py", 30));
		cat.add(new wow("haha", 30));
		cat.add(new wow("python", 33));
		cat.add(new wow("py", 35));
		cat.add(new wow("haha", 9));

		for (Iterator<wow> it = cat.iterator(); it.hasNext();) {
			Object see = it.next();
//			System.out.println(see);

		}

		for (wow see : cat) {
			System.out.println(see);
		}

	}

}

class plate implements Comparator<wow> {
	@Override
	public int compare(wow o1, wow o2) {

		int tmp = o1.getName().compareTo(o2.getName());
		int temp = o1.getAge() - o2.getAge();

		return temp == 0 ? tmp : temp;

	}

}
~~~



#### 8、集合加泛型练习：

~~~java
package com.nose.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.maps.Student;

// 练习：
/*
 * 学生对象（姓名、年龄）都有对应的归属地。
 * Key=Student Value = String
 * 
 * 1、将学生和归属地存储到HashMap集合中并取出。
 * 同姓名同年龄视为同一人。
 * 
 * 2、按照学生的年龄进行升序排列并取出。
 * 	按照学生的姓名进行升序排列并取出。
 * 
 * */

public class MapLx {
	public static void main(String[] args) {

		Map<Student, String> hukou = new LinkedHashMap<Student, String>(); 
		hukou.put(new Student("zhangsan", 18), "sichuan");
		hukou.put(new Student("lisi", 15), "shandong");
		hukou.put(new Student("zhangsan", 18), "shanxi");
		hukou.put(new Student("zhangsan", 18), "jilan");
		hukou.put(new Student("wangwu", 22), "nongcun");
		hukou.put(new Student("tutu", 18), "beijing");
		hukou.put(new Student("tutu", 19), "haierbing");
		hukou.put(new Student("daniu", 75), "heifenzhai");
		hukou.put(new Student("zhouxiao", 18), "sichuan");

		sta1(hukou);
//		sta2(hukou);

	}

	private static void sta2(Map<Student, String> hukou) {
		// 2、按照学生的年龄进行升序排列并取出。
		Map<Student, String> paixu = new TreeMap<Student, String>();
		paixu.putAll(hukou);

		Set<Student> St = paixu.keySet();
		for (Iterator<Student> it = St.iterator(); it.hasNext();) {
			Student hKey = it.next();
			String zVlue = paixu.get(hKey);
			System.out.println(hKey + ">>" + zVlue);

		}

	}

	private static void sta1(Map<Student, String> hukou) {
		// 取出元素。

		Set<Student> set = hukou.keySet();
		for (Iterator<Student> it = set.iterator(); it.hasNext();) {
			Student Keys = it.next();
			String Vlues = hukou.get(Keys);

			System.out.println(Keys + "==" + Vlues);

		}

	}

	static // 自定义编译器：
			// 按照学生的姓名进行升序排列并取出。
	Comparator<Student> dingyi = new Comparator<Student>() {
		public int compare(Student o1, Student o2) {

			int temp = o1.getName().compareTo(o2.getName());
			return temp == 0 ? o1.getAge() - o2.getAge() : temp;
		};
	};

}

~~~



#### 9、对一个集合数组（存在重复对象），进行排序

~~~java
package com.nose.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Huo {
	public static void main(String[] args) {
		
		// 对一个集合数组（存在重复对象），进行排序
		/*
		 * 分析：存在重复对象，集合为List ， 
		 * 	需要排序，可实现impor
		 * 
		 * */
		
		List<String> list = new ArrayList<String>();
			list.add("abcagg");
			list.add("haha");
			list.add("zyyada");
			list.add("nbadsfg");
			list.add("haha");
			list.add("zyyada");
			list.add("nbadsfg");
			
		// 对集合数组进行排序
			 toStory(list);
		
		// 迭代器，迭代出元素
		List<String> shuju =list;
		for (Iterator<String> it = shuju.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
		
	}
		// 定义排序功能。
	private static void toStory(List<String> list) {
			list.sort(new paixu());	
	}
	
}
	// 创建类，实现方法。完成排序的方式。
class paixu implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		int temp = o1.length()-o2.length();
		
		return temp==0?o1.compareTo(o2):temp;
	}
}
~~~

