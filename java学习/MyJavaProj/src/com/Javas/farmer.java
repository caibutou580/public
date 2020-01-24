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
