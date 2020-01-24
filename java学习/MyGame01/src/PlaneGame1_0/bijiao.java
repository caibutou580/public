package PlaneGame1_0;

import java.util.Comparator;

import jihe.book;


// 自定义排序
public class bijiao implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		book sta1 = (book) arg0;
		book sta2 =(book) arg1;
		
		int temp= sta1.getName().compareTo(sta2.getName());

		return temp==0?sta1.getAge()-sta2.getAge():temp;
	}

}
