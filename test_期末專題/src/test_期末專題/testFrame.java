package test_期末專題;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


public class testFrame extends JFrame implements KeyListener {
	private JPanel contentPane;
	private static JLabel lblNewLabel;
	private newlabel nl;
	private static JPanel panel;
	private Thread threadlabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame frame = new testFrame();
					frame.setVisible(true);
					frame.addKeyListener(frame);
					frame.setSize(800,800);
					testCanvas_2 test = new testCanvas_2();
					panel.add(test);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public testFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		nl = new newlabel();
		panel.add(nl);
		threadlabel = new Thread(nl);
		threadlabel.start();
		
	}
	//鍵盤控制
	public void keyPressed(KeyEvent e){     
		switch(e.getKeyCode()){
		
		case KeyEvent.VK_DOWN:
			if(nl.getlabelY()+20<=300){
				nl.setY(nl.getlabelY()+20);
			}else{
				nl = new newlabel();
				panel.add(nl);
				Thread threadlabel = new Thread(nl);
				threadlabel.start();
			}
			break;
		case KeyEvent.VK_LEFT:
			if(nl.getlabelX()-20>=0){
				nl.setX(nl.getlabelX()-20);
			}
			break;
		case KeyEvent.VK_RIGHT:
			if(nl.getlabelX()+20<=300){
				nl.setX(nl.getlabelX()+20);
			}
			break;
		case KeyEvent.VK_SPACE:
			nl.setY(300);
			nl = new newlabel();
			panel.add(nl);
			Thread threadlabel = new Thread(nl);
			threadlabel.start();
			break;
		}
	}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
}

