package day10;

class Outer { // 外部类
	static String name = "小王";
	static int num = 12;

//	void sta1() {
//		Inner s = new Inner();
//		s.show();	//调用内部类
//	}

	static class Inner { // 内部类
		void show() {
			System.out.println(name);
			System.out.println(num);
		}
	}

}

public class teacher {
	public static void main(String[] args) {
		Outer.Inner st = new Outer.Inner();
			st.show();
	}

}
