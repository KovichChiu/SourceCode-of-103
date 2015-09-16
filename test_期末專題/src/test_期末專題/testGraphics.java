package test_´Á¥½±MÃD;
import java.awt.*;
import java.awt.event.*;
public class testGraphics extends Canvas{
	public void paint(Graphics g){
		int x = (400-100)/10;
		int y = (700-100)/20;
		for(int i=0;i<=10;i++){
			g.drawLine(100+(x*i), 100, 100+(x*i), 700);
		}
		for(int i=0;i<=20;i++){
			g.drawLine(100, 100+(y*i), 400, 100+(y*i));
		}
	}
	public void drawbox(int i,int j){
		
	}
}
