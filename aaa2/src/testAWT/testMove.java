package testAWT;

import java.awt.event.*;

import javax.swing.Timer;

import java.util.ArrayList;

public class testMove implements Runnable {
	private Timer t1;
	private int timeset = 700;
	testPass tp = new testPass();
	testEX TM = new testEX();
	public testMove(testBox box, testlabel label) {
		setTime(label);
		t1 = new Timer(timeset, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (box.Downtouch() && box.gamestop()) {
					box.BoxDown();
					label.reDraw();
				} else {
					if(!box.gamestop()){
						t1.stop();
						TM.setVisible(true);
					}else{
						box.stopChengeColor();
						box.checkHor();
						label.doMakeNewBox();
						t1.stop();
					}
				}
			}
		});
	}

	public void run() {
		t1.start();
	}
	public void setTime(testlabel lb){
		timeset = 700-lb.timerminus();
		if(timeset<350){
			t1.stop();
			tp.setVisible(true);
		}
	}
}
