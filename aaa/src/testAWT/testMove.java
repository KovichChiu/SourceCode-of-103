package testAWT;

import java.awt.event.*;

import javax.swing.Timer;

import java.util.ArrayList;

public class testMove implements Runnable {
	private Timer t1;
	int b;
	public testMove(testBox box, testlabel label) {
		t1 = new Timer(500, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (box.Downtouch()) {
					box.BoxDown();
					label.reDraw();
				} else {
					box.stopChengeColor();
					box.checkHor();
					label.doMakeNewBox();
					t1.stop();
				}
			}
		});
	}

	public void run() {
		t1.start();
		System.out.println("5");
	}
	
	public void s(){
		t1.stop();
	}
}
