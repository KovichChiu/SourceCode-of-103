package test_´Á¥½±MÃD;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class testThread extends JFrame {

	private JPanel contentPane;
	private static JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testThread frame = new testThread();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		delayy();
		
	}
	/**
	 * Create the frame.
	 */
	public testThread() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		label = new JLabel("");
		panel.add(label);
		label.setIcon(new ImageIcon("C:/Users/Kovich/Desktop/111.png"));
		label.setBounds(0, 0, 34, 34);

	}
	public static void delayy(){
		
			try{
				while(true){
					Thread.sleep(500);
					label.setLocation(label.getX(), label.getY()+20);
				}
			}catch(Exception e){}
		}
	}
