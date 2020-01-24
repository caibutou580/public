package works;

import java.util.Comparator;

public class ppp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// 向下转型
		String s1 = (String) o1;
		String s2 = (String) o2;
		
		//按照长度排列（有短到长）
		int temp =s1.length()-s2.length(); 

		return temp==0?s1.compareTo(s2):temp;
	}
}
