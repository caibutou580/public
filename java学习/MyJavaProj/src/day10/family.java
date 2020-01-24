package day10;

//定义一个方法判断值key 是否在数组sta1中出现，并显示第一次出现的位置。

class map {
	
	 int box(int[] sta1, int key) {
		for (int x = 0; x < sta1.length; x++) {
			if (key == sta1[x]) {
				System.out.println(x);
				return x;
			}
		}
		
		return 1;
	}
}

public class family{
	public static void main(String[] args) {
		int[] sta1= {1,2,3,4,5,6,7};
		map mp =new map();
		mp.box(sta1,7);
		
	}
}