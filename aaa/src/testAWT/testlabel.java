package testAWT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class testlabel extends JFrame implements KeyListener{

	private JPanel contentPane;
	private static testBox box = new testBox();
	private Mylabel[][] label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testlabel frame = new testlabel(box);
					frame.setVisible(true);
					frame.addKeyListener(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testlabel(testBox box) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		label = new Mylabel[10][20];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				label[i][j] = new Mylabel();
				panel.add(label[i][j]);
				label[i][j].setOpaque(true);
				label[i][j].setBounds(50 + (i * 30), 50 + (j * 30), 30, 30);
				label[i][j].setColor(box.getNumber(i, j));
				label[i][j].setBorder(BorderFactory
						.createLineBorder(Color.BLACK));
			}
		}
		doMakeNewBox();
		testRedraw redraw = new testRedraw(this);
		Thread redrawThread = new Thread(redraw);
		redrawThread.start();
	}
	
	public void doMakeNewBox() {
		box.MakeNewBox();
		testMove move = new testMove(box, this);
		Thread moveThread = new Thread(move);
		moveThread.start();
	}
	public void reDraw() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				label[i][j].setColor(box.getNumber(i, j));
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			if (box.Lefttouch()) {
				box.BoxLeft();
			}
			break;
		case KeyEvent.VK_RIGHT:
			if (box.Righttouch()) {
				box.BoxRight();
			}
			break;
		case KeyEvent.VK_DOWN:
			if(box.Downtouch()){
				box.BoxDown();
				reDraw();
			}
			break;
		case KeyEvent.VK_SPACE:
			box.speceBox();
			break;
		case KeyEvent.VK_UP:
			if(box.Turntouch()){
				box.turnBox();
			}
			break;
		}
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}

}