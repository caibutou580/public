package PlaneGame1_0;

public class ClassRoom {
	private String name;
	private int age;

	public ClassRoom() { // 无参构造
		super();

	}

	public ClassRoom(String name, int age) { // 有参构造
		super();
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

	// 覆写 equals 方法,建立pupil类自己判断对象是否相同的依据

	public boolean equals(Object xxx) {
		if (!(xxx instanceof ClassRoom)) {// 判断类型是否相同

		}
		// 强转
		ClassRoom p = (ClassRoom) xxx;
		return this.name.equals(p.name) && this.age == p.age;
	}


//	
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", age=" + age + "]";
	}

}
