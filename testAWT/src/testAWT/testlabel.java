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

import javax.swing.JLabel;

public class testlabel extends JFrame {

	private JPanel contentPane;
	static testBox box = new testBox();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testlabel frame = new testlabel(box);
					frame.setVisible(true);
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
		
		Mylabel [][] label = new Mylabel[10][20];
		for(int i=0;i<10;i++){
			for(int j=0;j<20;j++){
				label[i][j] = new Mylabel();
				panel.add(label[i][j]);
				label[i][j].setOpaque(true);
				label[i][j].setBounds(50+(i*30), 50+(j*30), 30, 30);
				label[i][j].setColor(box.getNumber(i, j));
				label[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			}
		}
		System.out.println("1");
		testMove move = new testMove(box);
		Thread moveThread = new Thread(move);
		moveThread.start();
		System.out.println("2");
	}

}
