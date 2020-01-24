package PlaneGame1_0;

import java.net.PasswordAuthentication;

public class text {
	public static void main(String[] args) {
		/*
		 * "12 13 53 56 1 3 5 56"对字符串中的数值进行升序排列后，生成一个数值有序的字符串。
		 * 
		 * 思路：
		 * 1、先将字符串转变成一个字符串数组。
		 * 2、再将字符串数组转变成一个int数组。
		 * 3、对int数组进行排序
		 * 4、最后将int数组转换成字符串。
		 * 
		 * */
		
		String sta1 ="12 13 53 56 1 3 5 56";
		
		String[] sta2 = fangfa(sta1);
	
	
		
	}

	private static String[] fangfa(String sta1) {
		// TODO Auto-generated method stub
//		1、先将字符串转变成一个字符串数组。
		String [] sta3= toStringArry(sta1);
		
//		 2、再将字符串数组转变成一个int数组。
		int [] sta4 = toIntArr(sta3);
		
//		3、对int数组进行排序
		stor(sta3);
		
		
//		 4、最后将int数组转换成字符串。
		
		
		
		return null;
	}

	private static void stor(String[] sta3) {
		// TODO Auto-generated method stub
		
	}

	private static int[] toIntArr(String[] sta3) {
		// TODO Auto-generated method stub
		int[] sb = new int[sta3.length];
		
		for (int i = 0; i < sb.length; i++) {
			
				sb[i]=Integer.parseInt(sta3[i]);
			
		}
		
		return null;
	}

	private static String[] toStringArry(String sta1) {
		// TODO Auto-generated method stub
		String [] sta3 =sta1.split(" ");
		
		return sta3;
	}
}
