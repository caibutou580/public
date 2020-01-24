package PlaneGame1_0;

//自动装箱和拆箱

public class notebook {
	public static void main(String[] args) {
		
//		// 自动装箱
//		Integer i1 =3; // 此时的i1被封装成为对象（等同于 Integer.valueOf(3)方法） 
//		
//		// 自动拆箱
//		 i1=i1+5; //此时的右边i1 将自动转变成int类型的整数 (等同于 i.intValue())
//	   // 注意：左边的i1，自动装箱，变成对象
//		System.out.println(i1);
		
		// jdk1.5 以后，自动装箱的值如果在byte范围以内，相同的值不会单独开辟新空间，而是重复使用。
		Integer m=127;
		Integer n=127;
		System.out.println(m==n);	// true
		System.out.println(m.equals(n));  // ture
		
		Integer x=128;
		Integer y=128;
		System.out.println(x==y);  // false
		System.out.println(x.equals(y)); // ture
	}
}
