package testAWT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

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
	private JPanel panel;
	private static testBox box = new testBox();
	private Mylabel[][] label;
	private JLabel Score = new JLabel();
	private int Score_Integer = 0;
	private String Score_String;

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

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Score= new JLabel();
		Score.setText(Score_String);
		panel.add(Score);
		Score.setBounds(400, 10, 500, 100);
		
		label = new Mylabel[10][20];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				label[i][j] = new Mylabel();
				panel.add(label[i][j]);
				label[i][j].setOpaque(true);
				label[i][j].setBounds(50 + (i * 30), 50 + (j * 30), 30, 30);
				label[i][j].setColor(box.getColor(i, j));
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
	public void countScore(){
		Score_Integer = box.returnScore();
		reDraw();
	}
	public void reDraw() {
		Score_String = String.valueOf(Score_Integer);
		Score.setText("分數  "+Score_String);
		Score.setFont(new Font("分數  "+Score_String,Font.BOLD,30));  
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				label[i][j].setColor(box.getColor(i, j));
			}
		}
	}
	public int timerminus(){
		int x = 0;
		if(Score_Integer >= 150){
			x+=50;
		}
		if(Score_Integer >= 250){
			x+=50;
		}
		if(Score_Integer >= 400){
			x+=50;
		}
		if(Score_Integer >= 550){
			x+=50;
		}
		if(Score_Integer >= 700){
			x+=50;
		}
		if(Score_Integer >= 800){
			x+=50;
		}
		if(Score_Integer >= 900){
			x+=50;
		}
		if(Score_Integer >= 1100){
			x+=50;
		}
		return x;
	}
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			if (box.Lefttouch()) {
				box.BoxLeft();
			}
			countScore();
			break;
		case KeyEvent.VK_RIGHT:
			if (box.Righttouch()) {
				box.BoxRight();
			}
			countScore();
			break;
		case KeyEvent.VK_DOWN:
			if(box.Downtouch()){
				box.BoxDown();
				reDraw();
			}
			countScore();
			break;
		case KeyEvent.VK_SPACE:
			box.speceBox();
			countScore();
			break;
		case KeyEvent.VK_UP:
			if(box.Turntouch()){
				box.turnBox();
			}
			countScore();
			break;
		}
		
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}

}
