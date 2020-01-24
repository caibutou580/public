package day10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.Javas.farmer;

// 往ArrayList中存储自定义对象。

public class pear {
	/*
	 *思路：1，描述farmer
	 *	2、定义容器
	 *	3、将多个farmer对象存入容器中
	 *	4、取出farmer对象 
	 */
	public static void main(String[] args) {
		
		farmer f1 = new farmer();
			f1.setAge(11);
			f1.setName("zhangsan1");
		
		farmer f2 =new farmer();
			f2.setName("lisi1");
			f2.setAge(12);
		
		// 定义容器：
		List d = new ArrayList();
		
		//将多个farmer对象存入容器中
		d.add(f1);
		d.add(f2);
		d.add(new farmer("zhangsan2",34));
		
		// 取出farmer对象
		for (Iterator it = d.iterator(); it.hasNext();) {
			Object obj = it.next();
			System.out.println(obj.toString());	
		}
		
		for (Iterator st = d.iterator(); st.hasNext();) {
//			Object obj =  st.next();
			farmer ot = (farmer) st.next(); // 【注意】：取出的元素都是Object类型。需要具体对象内容时，需要向下转型。
			
			System.out.println(ot.getName());
			System.out.println(ot.getAge());	
		}
				
	}

}
