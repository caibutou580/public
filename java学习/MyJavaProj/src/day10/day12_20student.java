package day10;
/*
 * grandfather：
 * 	讲课
 * 	钓鱼
 * 
 * grandma
 * 
 * 		讲课；
 * 		看电影
 * 要求：体现多态，向上转型，向下转型	
 */


abstract class man{
	public abstract void talk(); 
}

class home extends man{
	public void talk() {		//
		System.out.println("讲课");
	}
}

class grandfather extends home{
	void fish() {
		System.out.println("钓鱼方法");
	}
}

class grandma extends home{
	
	void look() {
		System.out.println("看电影");
	}
	
}


public class day12_20student {
	public static void main(String[] args) {
		home ho1 = new grandfather();  //向上转型
		home ho2 = new grandma();
		see(ho1);
		see(ho2);
		
		// 向下转型
		grandfather gf =(grandfather) ho1;
		gf.talk();
		gf.fish();
		
		grandma gm = (grandma) ho2;
		gm.look(); 	// 向下转型
		gm.talk();
		
	}

	public static void see(home st) {
		st.talk();
	}
}






