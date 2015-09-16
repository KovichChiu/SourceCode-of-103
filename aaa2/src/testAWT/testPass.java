package testAWT;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class testPass extends JFrame {

	private JPanel contentPane;
	private testlabel  tl;
	private testBox tb = new testBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testEX frame = new testEX();
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
	public testPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel JP = new JPanel();
		contentPane.add(JP, BorderLayout.SOUTH);
		JP.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel pan_over = new JPanel();
		JP.add(pan_over);
		pan_over.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("\u904A\u6232\u7D50\u675F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		pan_over.add(btnNewButton);
		
		JPanel pan_Title = new JPanel();
		contentPane.add(pan_Title, BorderLayout.NORTH);
		pan_Title.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblvictory = new JLabel("\u301D\u2605\u2606\u2605\u89AA\u611B\u7684\u4F60Victory\u56C9\u2605\u2606\u2605\u301E");
		lblvictory.setFont(new Font("\u301D\u2605\u2606\u2605\u89AA\u611B\u7684\u4F60Victory\u56C9\u2605\u2606\u2605\u301E",Font.PLAIN,30));  
		pan_Title.add(lblvictory);
	}

}
