package PlaneGame1_0;
//  通过缓冲区，将要打印的矩形成元素*进行存储后，一次性返回，并输出；

//

public class children {

	public static void main(String[] args) {
		int[] z= {1,2,3,2,3,4,453,7,8,24,2,51234,};
		System.out.println(hat(z));
	}

	public static String cap(int m, int z) {
		StringBuffer sb = new StringBuffer();

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < z; y++) {

				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

// 将int数组转换为字符串 ，为[12,44,23]格式。

	// 方法一：
	public static String small(int[] arr) {
		String set = "[";
		for (int s = 0; s < arr.length; s++) {
			if (s != arr.length-1) {
				set = set + arr[s] + " ,";
			} else {
				set = set + arr[s] + "]";
			}
			
		}
		return set;
	}
	
	//方法二： 利用StringBuffer
	
	public static String hat(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1) {
				sb.append(arr[i]+", ");
			}else {
				sb.append(arr[i]+"]");
			}
		}
		
		return sb.toString();
		
	}

}