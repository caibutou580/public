package com.Javas;

public class day_12_3 {
	public static void main(String[] args) {
		worker wk = new worker();
		wk.stu();
		
	}

}

class student{
	int age;
	private String name;
	void stu(){
		System.out.println("学习");
	}
}

class worker extends student{
	void sing(){
		System.out.println("工作");
	}
}
