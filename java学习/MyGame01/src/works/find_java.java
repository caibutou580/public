package works;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class find_java {

	public static void main(String[] args) {

		// 获取一个想要的指定文件的集合。获取 下E:\elephant\java学习（包含子目录）的所有的.java的文件对象。并存储到集合中。
		/*
		 * 思路： 1、初始化指定文件夹。 2、创建集合容器 3、使用递归方法遍历查找
		 * 
		 */
		File sta1 = new File("E:\\elephant\\java学习");

		// 调用查找方法
		get(sta1);

	}

	public static void get(File sta1) {

		// 创建集合容器
		Set temp = new HashSet();

		// 获取文件对象

		File[] file = sta1.listFiles();

		// 遍历文件对象

		for (File like : file) {

			if (like.isDirectory()) {
				get(like);
			} else {
//				System.out.println(like.getName());
				if (like.getName().endsWith(".java")) {
					temp.add(like);

				}
			}

		}

		for (Iterator it = temp.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			System.out.println(obj);

		}

	}

}

//class book implements FilenameFilter{
//	String sta2;
//
//	public book(String sta2) {
//		super();
//		this.sta2 = sta2;
//	}
//
//	@Override
//	public boolean accept(File like, String name) {
//		
//		return name.endsWith(sta2);
//	}
//
//
//	
//}
