import java.awt.*;

import javax.swing.*;

import Sign_in.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sign_up extends JFrame{
	 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 

	private Container cp ;
	private JLabel jlb2 = new JLabel("Passwd");	
	private JLabel jlb4 = new JLabel("Account");
	private JLabel jlb5 = new JLabel("姓名");
	private JPasswordField pwd = new JPasswordField();
	private JButton jbt1 = new JButton("return");
	private JButton jbt2 = new JButton("Create an Account");
	private final JTextField id = new JTextField();
	private final JTextField Name = new JTextField();
	
	public sign_up(Login log) {
		setVisible(true);
		cp = this.getContentPane();
		this.setBounds(100,100,518,446);
		this.setTitle("sign_up");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//僅關閉此視窗
		getContentPane().setLayout(null);
		jlb2.setBounds(122,157,92,20);
		
		jlb4.setBounds(122,116,50,20);
		jlb5.setBounds(122,68,50,20);
		pwd.setBounds(217,157,100,20);
		Name.setBounds(217, 68, 100, 20);
		id.setBounds(217, 116, 100, 20);			
		jbt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 login abc = new login(log);
				 setVisible(false);
			}
		});		
		jbt1.setBounds(82,266,105,20);
		jbt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idd=id.getText();
				String name=Name.getText();
				String pswd=pwd.getText();
				System.out.println("id:"+idd);
				System.out.println("name:"+ name);
				System.out.println("pwd:"+ pswd);
				log.addNewPlayer(idd,name,pswd);
			}
		});
		jbt2.setBounds(282,266,187,20);
		cp.add(jlb2);
		cp.add(jlb4);
		cp.add(jlb5);
		cp.add(pwd);
		cp.add(jbt1);
		cp.add(jbt2);
		cp.add(Name);
		cp.add(id);
	}
}
