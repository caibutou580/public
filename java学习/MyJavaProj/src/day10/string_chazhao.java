package day10;
/**
 * sta1="asgjkasoasgasiuasoasp"
 * sta2="as"
 * 查找字符串sta2 在sta1中出现的次数 
 *  
 */


public class string_chazhao {
	
	public static void main(String[] args) {
		
		String sta1="asgjkasoasgasiasuasoaspasf";
		String  sta2="as";
		
		int coun = get(sta1,sta2);
		
		System.out.println(coun);
		
	}
	

	public static int get(String sta1, String sta2) {
		
		
		int count=0;  // 定义变量计数。
		int index=0;  //定义变量记录每次找到的角标
		
		// 循环。明确下一次查找的位置
		while((index=sta1.indexOf(sta2,index))!=-1) {
			count++;
			index+=sta2.length();	// 下一次查找的位置
		}
		
		return count;
	}
	
}
