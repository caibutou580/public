package PlaneGame1_0;

public class sofa {
	public static void main(String[] args) {
		/*
		 *StingBuffer 练习
		 * 
		 */
		
		// 1、创建StringBuffer（缓冲区）对象
		StringBuffer sb = new StringBuffer();
		
		// 追加字符串。
		sb.append("hello");
		
		//插入字符串。
		sb.insert(1,"wold"); // 在第一个元素后面插入内容
		
		// 删除字符。
		sb.delete(1, 4); // 注意：左闭右开 原则。
		
		// 替换字符。
		sb.replace(1,4,"java"); // 左闭右开 原则
		
		System.out.println(sb); // print(println) 是一个方法，它会将打印的内容转换为字符串打印出来。如果打印的是对象，它会调用该对象。
		System.out.println(sb.toString()); // 与上面的打印结果相同。
		
	}

}
