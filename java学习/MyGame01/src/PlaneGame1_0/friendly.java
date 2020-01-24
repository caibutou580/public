package PlaneGame1_0;
/**
 * 判断两个字符串中出现的最长的相同字符。
 * 
 * 思路：
 * sta1="xigsawefihjeoi"
 * sta2="fcefihwoiej"
 * 
 * 以短字符串为主，与长字符串比较
 * 如果没有将短字符串减一，在做比较。
 * 规律：
 * 0~length()           fcefihwoiej
 * 0~lenght()-1   1~length()     fcefihwoie   cefihwoiej
 * 0~length()-2   1~length()-1   2~length()  fcefihwoi  cefihwoie  efihwoiej
 * 
 * */


class kite{
	void run() {
	String sta1="xigsawefihwojeoi";
	String sta2="fcefihwoiej";
	
	String max = kite(sta1,sta2);

	}

	public String kite(String sta1, String sta2) {
		// 判断长短；
		String longstr = sta1.length() > sta2.length()?sta1:sta2;
		String shortstr= sta1.length() < longstr.length()?sta1:sta2; 
		
//		System.out.println(longstr);
//		System.out.println(shortstr);
		for(int i=0;i<shortstr.length();i++) {	//外层循环
			
			for(int x=0,y=shortstr.length()-i;y<=shortstr.length();y++,x++) {
				String tmp=shortstr.substring(x,y);
//				System.out.println(tmp);
//				if(longstr.contains(tmp)) {
//					System.out.println(tmp);
//				String set=longstr.concat(tmp);
//				System.out.println(set);
			
			if(longstr.contains(tmp)) {
				System.out.println(tmp);
//			String set=longstr.concat(tmp);
//			System.out.println(set);
			}
				}
				 
				
			
		}
			
		
		
		return null;
	}
	
	
}

public class friendly {

	public static void main(String[] args) {
		kite ki = new kite();
		ki.run();
	}

}
