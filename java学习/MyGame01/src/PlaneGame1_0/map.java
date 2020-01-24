package PlaneGame1_0;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/*
 飞机游戏窗口 
 
 */

public class map extends JFrame{
	/**
	 初始化窗口
	 */
	public void box() {
		this.setTitle("飞机作品");
		this.setVisible(true); //窗口可见
		this.setSize(500,500); //设置窗口大小
		this.setLocation(300,300); //设置窗口位置
		
		/**
		 * 该方法关闭窗口的同时，关闭该程序
		 */
		this.addWindowListener(new WindowAdapter(){
		
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
	}
	
	public static void main(String[] args) {
		map mp = new map();
		mp.box();
	}

}
