package com.Javas;
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
