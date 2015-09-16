package test_´Á¥½±MÃD;
import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JLabel;

public class newlabel extends JLabel implements Runnable{
	Random ran = new Random();
	Timer t1;
	public newlabel(){
		this.setOpaque(true);
		this.setBackground(Color.BLUE);
		setBounds(ran.nextInt(300)+1,0,30,30);
		t1 = new Timer(500,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(getY()<300){
					setBounds(getX(),getY()+30,34,34);
				}else{
					t1.stop();
				}
			}
		});
	}
	public void run(){
		t1.start();
	}
	public void setX(int X){
		setBounds(X, getY(), 34, 34);
	}
	public void setY(int Y){
		setBounds(getX(), Y, 34, 34);
	}
	public int getlabelY(){
		return getY();
	}
	public int getlabelX(){
		return getX();
	}
}
