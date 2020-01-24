package com.Javas;

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
		
		if(!(sta1 instanceof dog)){
			System.out.println("类型不匹配");
			return ;
		}
		
		dog dg = (dog) sta1;
		dg.dream();
	}
		//定义一个静态的bag方法，用来接收一个 Animal 类型的参数
		public static void bag(Animal na) { 
			na.ect();
		
	}
}
