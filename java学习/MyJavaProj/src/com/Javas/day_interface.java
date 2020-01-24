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
class ear implements/*实现*/ mouth,black{ //多继承
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
