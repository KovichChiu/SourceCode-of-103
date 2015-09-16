package testAWT;

import java.awt.event.*;

import javax.swing.Timer;

public class testRedraw implements Runnable {
	private Timer t1;

	public testRedraw(testlabel label) {
		System.out.println("6");
		t1 = new Timer(1, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.reDraw();
			}
		});
	}

	public void run() {
		t1.start();
		System.out.println("5");
	}
}
