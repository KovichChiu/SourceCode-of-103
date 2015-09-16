package testAWT;

import javax.swing.*; 

import java.awt.*; 
import java.util.Random;

public class testCanvas_2 extends JComponent {
	testBox tbox = new testBox();
	Random ran = new Random();
	public testCanvas_2(){
		tbox.setNumber(5, 1, 1);
		tbox.setNumber(5, 2, 1);
		tbox.setNumber(5, 3, 1);
		tbox.setNumber(5, 4, 1);
	}
	public void paintComponent(Graphics gra){
		
		super.paintComponent(gra);
		
//		畫直線from(100,100)to(400,700)
		
		int x = (400-100)/10;
		int y = (700-100)/20;
//		int a=0;
//		int b=0;
//		while(a<=10 && b<=20){
//			gra.drawLine(100+(x*a), 100, 100+(x*a), 700);
//			gra.drawLine(100, 100+(y*b), 400, 100+(y*b));
//			if(b<20){
//				b++;
//				gra.drawLine(100, 100+(y*(b)), 400, 100+(y*(b)));
//			}
//			a++; b++;
//		}
		for(int i=0;i<=10;i++){
			gra.drawLine(100+(i*x), 100, 100+(i*x), 700);
		}
		for(int i=0;i<=20;i++){
			gra.drawLine(100, 100+(i*y), 400, 100+(i*y));
		}
		gra.setColor(Color.BLUE);
        gra.fillRect(100, 100, 30, 30);
	}
	
//	實做自訂元件時，
//	最好覆寫這getPreferredSize、getMaximumSize、getMinimumSize三個方法
//	因為許多LayoutManager都可能由這三個方法來決定此物件的大小
	
	public Dimension getPerferredSize(){
		return new Dimension(800,800);
	}
	
	public Dimension getMaximumSize(){
		return getPerferredSize();
	}
	
	public Dimension getMinimumSize(){
		return getPerferredSize();
	}
	
	public static void main(String [] args){
		
//		設定視窗外觀
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("testCanvas_2");
		testCanvas a = new testCanvas();
		frame.add(a);
//		在Swing的JFrame元件中，
//		要增加元件或是設定LayoutManager等動作，
//		要間接透過getContentPane()方法取得RootPane，
//		才能在上面進行動作。
		frame.getContentPane().add(new testCanvas_2());
		frame.setBackground(Color.WHITE);
		
//		設定視窗顯是在螢幕的位置
		frame.setBounds(600, 100, 525, 800);
		
		frame.setVisible(true);
	}
}
/*
 * JLabel label = new JLabel();
 * label.setBounds(100,100,30,30);
 * label.setOpaque(true);
 * label.setBackground(color.BLUE);
 */



