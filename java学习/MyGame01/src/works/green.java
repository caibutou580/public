package works;

import java.io.FileOutputStream;
import java.io.IOException;

public class green {
	private static final String huanhang = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// 初始化文件
		FileOutputStream sta1 = new FileOutputStream("C:\\Users\\猜不透！\\Desktop\\123.txt", true); // 添加 true
																									// 就可对文件进行续写（追加）

		// 写入数据
		sta1.write("hello".getBytes());
		sta1.write("\rjava".getBytes()); // \r 表示换行(windows中使用)

		// 跨平台换行解决方案：调用方法(huanhang)。
		String str = huanhang + "green";
		sta1.write(str.getBytes());

		// 释放资源
		sta1.close();

	}
}

