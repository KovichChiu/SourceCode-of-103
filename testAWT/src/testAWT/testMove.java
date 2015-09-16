package testAWT;

import java.awt.event.*;

import javax.swing.Timer;

import java.util.ArrayList;
public class testMove implements Runnable{
	private Timer t1;
	public testMove(testBox box){
		box.MakeNewBox();
		int a = box.getseat(0);
		int b = box.getseat(1);
		int a_i = box.getseat(2);
		int b_i = box.getseat(3);
		int color = box.getseat(4);
		boolean jujge = true;
		System.out.println("6");
		t1 = new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("4");
				if(jujge){
					if(a==0){
						if(box.getseat(5)<20){
							System.out.println("0");
							for(int i=0;i<b;i++){
								box.setNumber(b_i+i, box.getseat(5), color);
							}
							box.adda_j();
							
						}
					}else{
						if(b==0){
							System.out.println("0");
							if(box.getseat(5)<20){
								for(int i=0;i<a;i++){
									box.setNumber(a_i+i, box.getseat(5), color);
								}
								box.adda_j();
							}else{
								System.out.println("0");
								for(int i=0;i<a;i++){
									box.setNumber(a_i+i, box.getseat(5), color);
								}
								box.adda_j();
								for(int i=0;i<b;i++){
									box.setNumber(b_i+i, box.getseat(6), color);
								}
								box.addb_j();
							}
						}
					}
				}
			}
		});
	}
	public void run(){
		t1.start();
		System.out.println("5");
	}
}
