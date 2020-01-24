package day10;

// 定义规则 ( 接口形式 ):
interface USB{
	public void open(); // 开启功能
	public void close();	//关闭功能
}

// 购买符合规则的设备
class Mouse1 implements USB{
	public void open() {
		System.out.println("run open");
	}
	
	public void close() {
		System.out.println("run close");
	}
	
}

class Notebook{ 
	void run() {
		System.out.println("notebook run");
	}
	
	// 符合规则的外部设备
	public void yUSB(USB usb) {
		if(usb!=null) {
			usb.open();
			usb.close();
		}
	}
	
}


public class Notebook_usb {
	public static void main(String[] args) {
		Notebook book = new Notebook();
			book.run();
			book.yUSB(new Mouse1());	// 插上设备
	}
}





