package PlaneGame1_0;

// 私有封装练习
class student {
	 String name;
	private int age;

	void clean() {
		System.out.println("hello");
		System.out.println(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("输入有误！");
		}
	}

}

public class pupil {
	public static void main(String[] args) {
		student stu = new student();
		stu.name = "zhangsan";
		stu.setAge(1);
		stu.clean();
	}
}
