package com.Javas;
//java基础113页练习题

class students{
	String name;
	int num;

	void sta1() {
		name = "zhangsan";
	}

	void sta2() {
		System.out.println("hello" + num + "!");
	}

//	无参构造
	public students() {
		System.out.println("姓名 " + name + "; 成绩 " + num);
	}

//  有参数的构造
	public students(String name, int num) {
		name = name;
		num = num;
		System.out.println(name+num);
	}

}

public class jichu_lianxi {
	public static void main(String[] args) {
		students x =new students();
		students y =new students("xianmin",89);
	}
}