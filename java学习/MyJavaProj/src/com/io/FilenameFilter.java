package com.io;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

//获取一个想要的指定文件的集合。获取 下E:\elephant\java学习（包含子目录）的所有的.java的文件对象。并存储到集合中。
/*
 * 思路：1、创建文件夹对象。
 * 		2、采用递归遍历文件
 * 		3、利用过滤器，过滤
 * 
 * */

public class FilenameFilter {

	public static void main(String[] args) {

		File sta1 = new File("E:\\elephant\\java学习");

//		File[] right = sta1.listFiles();

		List bord = new ArrayList();

		List sta = bianli(sta1, bord);

	
	}

	
	public static List bianli(File sta1, List bord) {

		File[] right = sta1.listFiles();

		for (File push : right) {
			if (push.isDirectory()) {
				bianli(push, bord);
			} else {
				if(new Filers(".java").accept(push)) {
						bord.add(push);
				System.out.println(push);
				}
			
			}

		}

		return bord;
	}

}

// 制作过滤器：
class Filers implements java.io.FilenameFilter{
	String name;
	
	public Filers(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean accept(File dir, String toy) {
		// TODO Auto-generated method stub
		return toy.endsWith(name);
	}
}
