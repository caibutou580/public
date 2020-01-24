package PlaneGame1_0;
// 构造方法练习

class Person {
	// 创建构造方法
	public Person(String name, int age) {
		if (age > 0) {
			int a = age;
		} else {
			System.out.println("输入有误！");
		}

		System.out.println(name + age);
	}
}

public class apple {
	public static void main(String[] args) {
		new Person("zhangsan", 20);
	}
}
