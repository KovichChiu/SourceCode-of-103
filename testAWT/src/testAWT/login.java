package testAWT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.*;

public class login extends JFrame{

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login winFrame = new login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private Container cp ;
	private JLabel jlb1 = new JLabel("Account");
	private JLabel jlb2 = new JLabel("Passwd");
	private JTextField jtf1 = new JTextField();
	private JPasswordField jptf1 = new JPasswordField();
	private JButton jbt1 = new JButton("Login");
	private JButton jbt2 = new JButton("Sign up");
	
	public login() {
		setVisible(true);
		cp = this.getContentPane();
		this.setBounds(100,100,600,500);
		this.setTitle("login");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//¶ÈÃö³¬¦¹µøµ¡
		getContentPane().setLayout(null);
		
		jlb1.setBounds(159,90,50,20);
		jlb2.setBounds(159,160,50,20);
		jtf1.setBounds(271,90,100,20);
		jptf1.setBounds(271,160,100,20);
		jbt1.setBounds(67,278,105,20);
		jbt2.setBounds(291,278,108,20);
		
		cp.add(jlb1);
		cp.add(jlb2);
		cp.add(jtf1);
		cp.add(jptf1);
		cp.add(jbt1);
		cp.add(jbt2);
	}

}
