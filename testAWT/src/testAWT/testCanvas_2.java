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
		
//		�e���ufrom(100,100)to(400,700)
		
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
	
//	�갵�ۭq����ɡA
//	�̦n�мg�ogetPreferredSize�BgetMaximumSize�BgetMinimumSize�T�Ӥ�k
//	�]���\�hLayoutManager���i��ѳo�T�Ӥ�k�ӨM�w�����󪺤j�p
	
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
		
//		�]�w�����~�[
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("testCanvas_2");
		testCanvas a = new testCanvas();
		frame.add(a);
//		�bSwing��JFrame���󤤡A
//		�n�W�[����άO�]�wLayoutManager���ʧ@�A
//		�n�����z�LgetContentPane()��k���oRootPane�A
//		�~��b�W���i��ʧ@�C
		frame.getContentPane().add(new testCanvas_2());
		frame.setBackground(Color.WHITE);
		
//		�]�w������O�b�ù�����m
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



