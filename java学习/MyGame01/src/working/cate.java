package working;

import java.util.Scanner;

public class cate {
	public static void main(String[] args) {
		hita();
		
	}
	public static void hita() {
		Scanner st = new Scanner(System.in);
		System.out.println("请输入： ");
		int look = st.nextInt();
	
		String[] cake = {" "," 星期一", "星期二", "星期三", "星期四", "星期五", "星期六","星期日"};
		if(look<=0 || look>7) {
			System.out.println("输入错误");
		}else {
			System.out.println(cake[look]);
		}
		

	
	}
}
