package classWork_0511;
import java.awt.event.*;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.JLabel;

public class newlabel extends JLabel implements Runnable{
	Random ran = new Random();
	Timer t1;
	public newlabel(){
		this.setText(String.valueOf(ran.nextInt(20000)+1));
		setBounds(ran.nextInt(300)+1,0,100,25);
		t1 = new Timer(ran.nextInt(5000)+1,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(getY()<300){
					setBounds(getX(),getY()+20,100,25);
				}else{
					t1.stop();
				}
			}
		});
	}
	public void run(){
		t1.start();
	}
	public void stop2(){
		t1.stop();
	}
}

