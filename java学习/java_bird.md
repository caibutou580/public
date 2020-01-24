### 1 抽象类：

​	&& 关键字：***abstract***  // 抽象

​	&& 描述一个事物，却没有足够信息，这时就将这个事物称为抽象事物 （例如：水果，犬科等，不明确的东西）

~~~java
public class day_abstract {
	public static void main(String[] args) {
        tiger xt =new tiger();
		xt.caik();
	}
}

abstract class dongwu { // 定义一个抽象类
	abstract void caik(); // 定义一个抽象方法
}

class tiger extends dongwu {	// 该类继承dongwu类
	void caik() {
		System.out.println("老虎");
	}
}

class elephant extends dongwu {	//该类继承dongwu类
	void caik() {
		System.out.println("大象");
	}
}
~~~

 	***特点:***

​	<1>、抽样方法一定定义在抽样类中，都需要abstract来修饰。

​	<2>、抽象类不能实例化。（ 不能用new关键字创建对象 ）

​	<3>、如果子类没有覆盖所有的抽像方法，那么子类还是一个抽象类。

### ***2、接口***

<1>、初期理解：接口是特殊的抽象类。

定义接口的关键字：***interface***

【重点】：

​		接口中常见的成员有两种：1、全局变量。 2、抽象方法。

​		而且都有固定的修饰符， 成员都是用 public 修饰。

**<2>、接口的特点：**

​	1、接口不可以实例化。

​	2、需要覆盖了接口中的所有的抽象方法的子类，才可以实例化。

​	3、接口是用来实现的。

​	4、接口支持多继承。 

// 类与接口之间的关系：**实现关系。**

~~~java
package com.Javas;
//接口练习
					//关键字 interface
//定义接口
interface mouth{
	public abstract void eraser(); //定义两个抽象方法
	public abstract void ruler();
	
}

//实现接口
class ear implements/*实现*/ mouth {
	public void eraser() {
		System.out.println("===");
	}
	
	public void ruler() {
		System.out.println("...");
	}
}


public class day_interface {
	public static void main(String[] args) {
		ear cat =new ear();
		cat.eraser();
		cat.ruler();
	}
}

~~~

<3>、接口的多继承。

好处：& 可以让子类具备更多的功能。

​			& 一个类继承一个类的同时，还可以实现多个接口（避免了单继承的局限性）

​	

~~~java
package com.Javas;

//接口练习

//定义接口
interface mouth{
	public abstract void eraser(); //定义两个抽象方法
	public abstract void ruler();
	
}

interface black{
	public abstract void pig();
}

//实现接口
class ear implements/*实现*/ mouth,black{ //接口多继承(多实现)
	public void eraser() {
		System.out.println("===");
	}
	
	public void ruler() {
		System.out.println("...");
	}
	
	public void pig(){
		System.out.println("实现 black 接口");
	}
}


public class day_interface {
	public static void main(String[] args) {
		ear cat =new ear();
		cat.eraser();
		cat.ruler();
         cat.pig();
	}
}
~~~

【扩展】如果只是想实现接口中的个别方法，可以采用  ***空实现***  的方法

~~~java
//接口空实现练习
/*
 * 当一个类想实现接口中的部分接口时，
 * 可以采取空实现的方法
 */

interface fifteen{	// 定义接口
	public void show1();
	public void show2();
	public void show3();
	public void show4();
}

// 空实现方法
/*
 * 定义一个类，将用来实现接口，
 * 以后的每个类都可以继承该类 
 */
class giraffe implements fifteen{
	public void show1() {};
	public void show2() {};
	public void show3() {};
	public void show4() {};
}

class grammar extends giraffe{
	public void show1() { 
		System.out.println("空实现成功");
	}
}

class dream extends giraffe{
	public void show3() {
		System.out.println("=====");
        } 
}

public class day12_19 {
	public static void main(String[] args) {
		
	}
}
~~~



***类与接口：***

​	类用于描述的是事物的共性基本功能

​	接口用于定义的是事物的额外功能



### ***3、多态 ：***（对象的多态性）

【重点】多态在程序中的体现：父类的引用或者接口的引用指向了子类的对象。

好处：提高代码的扩展性。

弊端：不能使用子类的特有方法。

多态的前提：1、必须有关系：继承，实现。  2、通常有覆盖。

~~~java
abstract class Animal{  	// 抽象类（is a 关系）
	abstract void ect();	//定义一个抽象类
}

class dog extends Animal{
	void ect() {
		System.out.println("吃骨头");
	}
}

class cat extends Animal{
	void ect() {
		System.out.println("吃鱼");
	}
}


public class day_1219_duotai {
	public static void main(String[] args) {
		Animal sta1 =new dog(); 	//多态形式 创建dog对象
		Animal sta2 =new cat(); 	//多态形式 创建cat对象
		bag(sta1);	//调用bag方法，将sta1作为参数传入
		bag(sta2);	//调用bag方法，将sta2作为参数传入
		
	}
		//定义一个静态的bag方法，用来接收一个 Animal 类型的参数
		public static void bag(Animal na) { // 该方法简化了调用的复杂性
			na.ect();  
		
	}
}
~~~

 <1>、向上转型：

​		优点：隐藏了子类型，提高了代码的扩展性。

​		弊端：只能使用父类中的功能，不能使用子类中的特有功能。功能被限制。

何时使用向上转型：如果不需要面对子类型，通过提高扩展性，或者使用父类的功能即可完成操作，就是用向上转型。

~~~java
public class day_1219_duotai {
	public static void main(String[] args) {
		Animal sta1 =new dog(); 	// 该方法也称为 向上转型
		Animal sta2 =new cat(); 	
		bag(sta1);	//调用bag方法，将sta1作为参数传入
		bag(sta2);	//调用bag方法，将sta2作为参数传入
		
	}
		//定义一个静态的bag方法，用来接收一个 Animal 类型的参数
		public static void bag(Animal na) { 
			na.ect();
		
	}
~~~



<2>、向下转型：

​		优点：可以使用子类型的特有功能。

​		弊端：面对具体子类型，向下转型有风险。

​				   容易发生ClassCastException。只有转换类型和对象类型不匹配就会发生。想要安全，必须要进行判断。判断一个对象是否匹配摸一个类型，需要使用一个关键子***instanceof*** （用法：对象  instanceof 类型）

何时使用向下转型：需要使用子类型的特有方法时。但一定要判断。

~~~java
abstract class Animal{  	// 抽象类（is a 关系）
	abstract void ect();	//定义一个抽象类
}

class dog extends Animal{
	void ect() {
		System.out.println("吃骨头");
	}
	void dream() {
		System.out.println("天天吃肉");
	}
}


public class day_1219_duotai {
	public static void main(String[] args) {
		Animal sta1 =new dog(); 	// 该方法也称为 向上转型	
		bag(sta1);	//调用bag方法，将sta1作为参数传入
		dog dg =(dog) sta1;	//向下转型
		dg.dream();
		
	}
		//定义一个静态的bag方法，用来接收一个 Animal 类型的参数
		public static void bag(Animal na) { 
			na.ect();
		
	}
}
~~~



~~~java

//多态练习

abstract class Animal{  	// 抽象类（is a 关系）
	abstract void ect();	//
}

class dog extends Animal{
	void ect() {
		System.out.println("吃骨头");
	}
	void dream() {
		System.out.println("天天吃肉");
	}
	
}

class cat extends Animal{
	void ect() {
		System.out.println("吃鱼");
	}
}


public class day_1219_duotai {
	public static void main(String[] args) {
		Animal sta1 =new dog(); 	//多态形式 创建dog对象
		Animal sta2 =new cat(); 	//多态形式 创建cat对象
		bag(sta1);	//调用bag方法，将sta1作为参数传入
		bag(sta2);	//调用bag方法，将sta2作为参数传入
		
		if(!(sta1 instanceof dog)){	  // 判断类型
			System.out.println("类型不匹配");
			return ;
		}
		
		dog dg = (dog) sta1;  // 向下转型
		dg.dream();
	}
		//定义一个静态的bag方法，用来接收一个 Animal 类型的参数
		public static void bag(Animal na) { 
			na.ect();
		
	}
}
~~~

### ***4、内部类：***

定义：将一类定义在另一个类的里面，对里面那个类就称为内部类（内置类，嵌套类 ）。

访问特点：1、内部类可以直接访问外部类中的成员，包括私有成员。 2、外部类要访问内部类中的成员必须要建立内部类对象。

~~~java
例一：
class Outer { // 外部类
	String name = "小王";
	int num = 12;

	void sta1() {
		Inner s = new Inner();
		s.show();	// 调用内部类方法
	}

	class Inner { // 内部类
		void show() {
			System.out.println(name);
			System.out.println(num);
		}
	}
}

public class teacher {
	public static void main(String[] args) {
		Outer to = new Outer();
		to.sta1();
        
	}
}


例二：
 class Outer { // 外部类
	String name = "小王";
	int num = 12;

//	void sta1() {
//		Inner s = new Inner();
//		s.show();	//调用内部类
//	}

		class Inner { // 内部类
			void show() {
				System.out.println(name);
				System.out.println(num);
		}
	}

}

public class teacher {
	public static void main(String[] args) {
		Outer.Inner st = new Outer().new Inner(); //&&
			st.show();
	}

}
    
~~~



非静态类调用对象：

~~~java

 class Outer { // 外部类
	String name = "小王";
	int num = 12;

//	void sta1() {
//		Inner s = new Inner();
//		s.show();	//调用内部类
//	}

		class Inner { // 内部类
			void show() {
				System.out.println(name);
				System.out.println(num);
		}
	}

}

public class teacher {
	public static void main(String[] args) {
		Outer.Inner st = new Outer().new Inner(); // 非静态创建内部类对象
			st.show();
	}

}
~~~





静态类调用对象：

~~~java
class Outer { // 外部类
	static String name = "小王";
	static int num = 12;

//	void sta1() {
//		Inner s = new Inner();
//		s.show();	//调用内部类
//	}

	static class Inner { // 内部类
		void show() {
			System.out.println(name);//注意 name num 必须为静态
			System.out.println(num);
		}
	}

}

public class teacher {
	public static void main(String[] args) {
		Outer.Inner st = new Outer.Inner(); // 静态内部类创建对象
			st.show();
	}

}
~~~



====================================



​														===========================

API对象—String类： 

【重点】1、字符串是一个特殊的对象。一旦初始化就不可被改变。









==================================

​													=============================



### 5、StringBuffer



什么时候用字符串缓冲区：

​		数据很多，个数无所谓确定，数据类型无所谓确定（类型无所谓，个数确定），只要最后都转成字符串类型，就是用StingBuffer这个容器。

【使用的局限性】：1、必须最终转成字符串。 2、无法对存储进来的元素进行单独操作。（因为存储进来的多个数据都变成了一个字符串）

* 缓冲区的常见方法：
  * 添加字符：1、StringBuffer append(各种数据类型)；【追加的方式】。 2、StringBuffer  insert(index 各种数据类型)；【指定位置添加】。
  * 删除字符：delete(index,index)  左闭右开
  * 替换字符：replace(index,index，替换内容)  左闭右开

~~~java
public class sofa {
	public static void main(String[] args) {
		/*
		 *StingBuffer 练习
		 * 
		 */
		
		// 1、创建StringBuffer（缓冲区）对象
		StringBuffer sb = new StringBuffer();
		
		// 追加字符串。
		sb.append("hello");
		
		//插入字符串。
		sb.insert(1,"wold"); // 在第一个元素后面插入内容
		
		// 删除字符。
		sb.delete(1, 4); // 注意：左闭右开 原则。
		
		// 替换字符。
		sb.replace(1,4,"java"); // 左闭右开 原则
		
		System.out.println(sb); // print(println) 是一个方法，它会将打印的内容转换为字符串打印出来。如果打印的是对象，它会调用该对象。
		System.out.println(sb.toString()); // 与上面的打印结果相同。
		
	}

}
~~~



基本数据类型对象包装类

* 将基本数据类型封装成对象的好处：可以在对象中定义更多的功能方法操作该数据。

* 常见的操作之一：用于基本数据类型与字符串之间的转换。【重要功能】

  ~~~java
  public class today {
  	public static void main(String[] args) {
  		
  		// 将字符串转换成int数据类型
  		System.out.println(Integer.parseInt("28") + 4);
  
  	}
  }
  
  // parseInt  parseDyte  parseDouble parseBoolean方法类似
  ~~~

  为了对整数进行更多操作：可将整数封装成对象（通过Integer的方法完成）

~~~java
public class today {
	public static void main(String[] args) {

		// 将整数封装成对象
		
		// 方法一：
		Integer i1 = new Integer(35);	//  构造的方法
		
		// 方法二：
		Integer i2 = Integer.valueOf(66); // 静态方法
		
	}
}
~~~



拆箱与装箱：

~~~java

//自动装箱和拆箱

public class notebook {
	public static void main(String[] args) {
		
		// 自动装箱
		Integer i1 =3; // 此时的i1被封装成为对象（等同于 Integer.valueOf(3)方法） 
		
		// 自动拆箱
		 i1=i1+5; //此时的右边i1 将自动转变成int类型的整数 (等同于 i.intValue())
	   // 注意：左边的i1，自动装箱，变成对象
		System.out.println(i1);
	}
}
~~~



【注意】：

~~~java
		// jdk1.5 以后，自动装箱的值如果在byte范围以内，相同的值不会单独开辟新空间，而是重复使用。
		Integer m=127;
		Integer n=127;
		System.out.println(m==n);	// true
		System.out.println(m.equals(n));  // ture
		
		Integer x=128;
		Integer y=128;
		System.out.println(x==y);  // false
		System.out.println(x.equals(y)); // ture
~~~



###  6、集合类

* 为什么出现集合类：

  ​		 面向对象语言对事物的体现都是以对象的形式，所以为了方便对多个对象的操作，就对对象进行存储，集合就是存储对象最常用的一种方法。

 

* 数组和集合类同是容器，有何不同 ？

​			 数组虽然也可以存储对象，但是长度是固定的；集合的长度是可变的。数组中可以存储基本数据类型，集合只能存储对象。



* 集合类的特点：

​			集合只用于存储对象，集合的长度是可变的，集合可以存储不同数据类型的对象。



集合的基本功能（Collection）:

1、添加：

​			boolean add(Object  sta); 一次添加一个对象。

​			boolean addAll(Collection  sta); 将指定容器中的所有对象添加进来。 

2、删除

​			boolean remove(Object  sta); 一次删除一个对象。

​			boolean removeAll(Collection  sta); 将指定容器中的所有对象删除。

3、获取长度：

​			int size();  获取集合内对象的长度。

4、判断：

​			boolean contains(Object sta);  判断集合中是否包含某个对象；

​			boolean containsAll(Collection sta);  判断集合中是否Collection中所有元素；

~~~java

import java.util.Collection;
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
~~~



5、取出集合元素。

​	Iterator iterator()

​	获取集合中元素上的 迭代功能的迭代器对象

​	迭代：取出元素的一种方式。

​	迭代器：具备迭代功能的对象。 （迭代器对象不需要new. 直接通过 iterator() 方法获取即可。）【建议】：用for 方法

~~~java
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
			for (Iterator yy = c.iterator(); yy.hasNext();) {
				System.out.println(yy.next());
				
			}
	}
}
~~~



Collection 子接口：（ List 、Set ）

1、List :

​		有序集合（也称为*序列* ）。 该界面的用户可以精确控制列表中每个元素的插入位置。 用户可以通过整数索引（列表中的位置）访问元素，并搜索列表中的元素。与集合不同，列表通常允许重复的元素。

【重点】List 接口中特有的方法：特有方法都是围绕索引定义的。（支持增删改查：）

~~~java
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
~~~

​	

​	【重点】 若想在集合遍历中添加元素，可以用List 集合的特有迭代器（ListIterstor)，通过List 集合的方法 listIterstor() 来实现。( 增、修、查 可使用)

~~~java
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class JiHeList {
	public static void main(String[] args) {
		List st = new Vector();
		
		st.add("sta1");
		st.add("sta2");
		st.add("sta3");
		
		// 利用迭代器对集合添加元素：错误方法
		
//		for (Iterator it = st.iterator(); it.hasNext();) {
//			Object obj = it.next();
//			if(obj.equals("sta2")){
//				st.add("haha");
//			}
//			
//		}
		
		// 利用迭代器对集合添加元素：正确方法如下：（迭代器的列表方法）
		for (ListIterator it = st.listIterator(); it.hasNext();) {
			Object obj = it.next();
			if(obj.equals("sta2")){
				it.add("haha");
			}
			
		}
		System.out.println(st);  // [sta1, sta2, haha, sta3]
			
	}

}
~~~



​	【了解】： List 集合的具体子类。子类之所以区分是因为内部的数据结构（存储数据的方式）不同。

* Vector ：数据结构是数组。数组是可变长度的（不断new新数组，并将原数组元素复制到新数组中）。线程同步，增删速度慢。
* ArrayList ：也是数组结构，也是可变长度的。线程不同步，替代了Verctor ，增删速度不快，查询速度快。
* LinkedList ：链表结构，线程不同步。增删速度很快，查询速度慢。



2、Set；

* HashSet ：哈希（散列）结构。特点：1、不允许存储重复元素（因为会发生查找的不确定性）。 2、不保证存入和取出的顺序一致。 3、比数组的查询效率高。

  (如何保证元素唯一性？)：

  ​	方法：元素覆盖hashCode和equals方法。（覆盖hashCode是为了根据元素自身的特点确定哈希值，覆盖equals方法是为了解决哈希值冲突。）

* TreeSet ：二叉树数据结构。可以对元素进行排序。不同步。

  （如何保证元素唯一性？）：

  ​	 方法：参考比较方法的返回值是否是0。是，就是重复元素，不存。

  排列方式： 需要元素具备比较功能。所以元素要实现Comparable接口，并覆盖CompareTo方法。

#### 【扩展技巧】：

集合框架中常用子类对象，存在的规律：（前缀名是数据结构名，后缀名是所属体系名）例如：

* ArrayList ：数组结构。看见数组，就知道查询快，看见List就知道，可重复，可以增删改查。
* LinkedList ：链表结构，增删快。
* HashSet ：哈希表结构。使用该类必须覆盖 hashCode equals方法。不保证有序。看见Set就知道不可以有重复值。
* LinkeHashSet ：链表+哈希表。可实现有序，因为有链表。
* TreeSet ：二叉树结构，可以排序。有该类就要想到两种比较方式：一种自然排序Comparable，一种是比较器Comparator。

##### 增强For循环：

作用：用于遍历Collection集合或数组。

格式：for(元素类型  变量 ：Collection容器或数组)

~~~java
package jihe;

import java.util.ArrayList;
import java.util.Collection;

// 增强for 循环练习：
public class ForAdd {
	public static void main(String[] args) {
		show(); 
		list();
	}

	private static void list() {
		// TODO Auto-generated method stub
		int [] look = {12,23,42,64,21,67};
		for (int i : look) {		// 增强for循环只是简单遍历出来，不能以索引操作元素。
									// 所以数组一般使用传统的for循环来操作。
			System.out.println(i);
		}
			
	}

	private static void show() {
		// TODO Auto-generated method stub
		Collection blue = new ArrayList();
		blue.add("sta1");
		blue.add("sta2");
		blue.add("sta3");
		blue.add("sta4");
		
		for (Object obj : blue) {
			System.out.println(obj);
		}	
	}
	
	
}
~~~



### 7、泛型：

​	【概括】 由于容器可以存放多个类型的对象，但在取出对象的特有内容时，需要向下转型，由于对象类型的不一致，会导致异常的发生。JDK1.5以后在定义集合时，直接明确集合中存储元素的具体类型。这种技术就称为泛型。

​	【好处】 1、将运行时期的问题转移到编译时期，可以更好的让程序员发现问题并解决问题。 2、避免了向下转型的麻烦。



























