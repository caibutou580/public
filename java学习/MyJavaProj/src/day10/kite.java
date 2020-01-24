package day10;

import java.io.ObjectInputStream.GetField;

public class kite {

	public static void main(String[] args) {
		String sta1 = "sseabcdefghi";
		String sta = "abcdef";

		// 将字符串分解为多个字符

		System.out.println(sta.toCharArray());

		// 通过字符串中指定位置获取的对应的字符
		System.out.println(sta.charAt(3));

		// 通过字符串中指定字符获取第一次出现的位置

		System.out.println(sta.indexOf('f'));

		// 指定的字符串在原字符串中是否出现以及出现的位置
		System.out.println(sta1.replaceFirst(sta1, sta));

	}

}
