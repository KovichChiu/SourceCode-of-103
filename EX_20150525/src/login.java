import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Sign_in.*;

public class login extends JFrame{

	private Container cp ;
	private JLabel jlb1 = new JLabel("Account");
	private JLabel jlb2 = new JLabel("Passwd");
	private JTextField jtf1 = new JTextField();
	private JPasswordField jptf1 = new JPasswordField();
	private JButton jbt1 = new JButton("Login");
	private JButton jbt2 = new JButton("Sign up");
	
	public login(Login log) {
		setVisible(true);
		cp = this.getContentPane();
		this.setBounds(100,100,518,446);
		this.setTitle("login");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//僅關閉此視窗
		getContentPane().setLayout(null);
		
		jlb1.setBounds(159,90,50,20);
		jlb2.setBounds(159,160,50,20);
		jtf1.setBounds(271,90,100,20);
		jptf1.setBounds(271,160,100,20);
		jbt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acc = jtf1.getText();
				String pass = jptf1.getText();
				
				if(log.verification(acc,pass)){
					Game gam=new Game();
					setVisible(false);
				}else{
					JOptionPane.showMessageDialog (null, "帳號密碼錯誤"+"請再輸入一次", "小叮寧", JOptionPane.INFORMATION_MESSAGE);
					System.out.println("");
				}
			}
		});
		jbt1.setBounds(67,278,105,20);
		jbt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 sign_up sgn_up = new sign_up(log);
				 setVisible(false);
			}
		});
		jbt2.setBounds(291,278,108,20);
		
		cp.add(jlb1);
		cp.add(jlb2);
		cp.add(jtf1);
		cp.add(jptf1);
		cp.add(jbt1);
		cp.add(jbt2);
	}

}
