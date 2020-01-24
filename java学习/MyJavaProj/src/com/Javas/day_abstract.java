package com.Javas;

public class day_abstract {
	public static void main(String[] args) {
		tiger xt =new tiger();
		xt.caik();
		elephant st=new elephant();
		st.caik();

	}
}

abstract class dongwu { // 定义一个抽象类
	abstract void caik(); // 定义一个抽象方法
}

class tiger extends dongwu {
	void caik() {
		System.out.println("老虎");
	}
}

class elephant extends dongwu {
	void caik() {
		System.out.println("大象");
	}
}
