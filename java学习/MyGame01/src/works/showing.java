package works;

import java.util.Comparator;

// 改写接口方法：
//实现Comparato接口，并改写Comparable（自然排序）


public class showing implements Comparator{
	// 姓名升序
//	@Override
//	public int compare(Object o1, Object o2) {
//		// 同姓名同年龄视为同一人，不存，姓名升序排列为自然数
//		soupman san = (soupman) o1;
//		soupman san2 = (soupman) o2;
//		
//		int temp = san.getName().compareTo(san2.getName());             	
//		return temp==0?san.getAge()-san2.getAge():temp;
//	}
	
	//年龄升序
	@Override
	public int compare(Object o1, Object o2) {
		soupman ag = (soupman) o1;
		soupman ag2 = (soupman) o2;
		
		int temp = ag.getAge()-ag2.getAge();
		
		
		return temp==0?ag.getName().compareTo(ag2.getName()):temp;
	}
}


