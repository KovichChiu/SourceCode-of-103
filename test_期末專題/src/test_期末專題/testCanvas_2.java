package test_�����M�D;

import javax.swing.*; 

import java.awt.*; 

public class testCanvas_2 extends JComponent{
	public testCanvas_2(){
		newlabel nl = new newlabel();
		Thread a = new Thread(nl);
	}
	public void paintComponent(Graphics gra){
		super.paintComponent(gra);
		
		//�e���ufrom(100,100)to(400,700)
		
		int x = (400-100)/10;
		int y = (700-100)/20;
		for(int i=0;i<=10;i++){
			gra.drawLine(100+(x*i), 100, 100+(x*i), 700);
		}
		for(int i=0;i<=20;i++){
			gra.drawLine(100, 100+(y*i), 400, 100+(y*i));
		}
	}
	
	//�갵�ۭq����ɡA
	//�̦n�мg�ogetPreferredSize�BgetMaximumSize�BgetMinimumSize�T�Ӥ�k
	//�]���\�hLayoutManager���i��ѳo�T�Ӥ�k�ӨM�w�����󪺤j�p
	
//	public Dimension getPerferredSize(){
//		return new Dimension(800,800);
//	}
//	
//	public Dimension getMaximumSize(){
//		return getPerferredSize();
//	}
//	
//	public Dimension getMinimumSize(){
//		return getPerferredSize();
//	}
	
}




