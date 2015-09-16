import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class test001 extends JFrame implements KeyListener {

	private JPanel contentPane;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test001 frame = new test001();
					frame.setVisible(true);
					frame.addKeyListener(frame);
					frame.setSize(360,385);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test001() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);
		label.setIcon(new ImageIcon("C:/Users/Kovich/Desktop/111.png"));
		label.setBounds(0,0,34,34);
	}
	public void keyPressed(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			if(label.getY()-20>=0){
				label.setLocation(label.getX(), label.getY()-20);
			}
			break;
		case KeyEvent.VK_DOWN:
			if(label.getY()+20<=300){
				label.setLocation(label.getX(), label.getY()+20);
			}
			break;
		case KeyEvent.VK_LEFT:
			if(label.getX()-20>=0){
				label.setLocation(label.getX()-20, label.getY());
			}
			break;
		case KeyEvent.VK_RIGHT:
			if(label.getX()+20<=300){
				label.setLocation(label.getX()+20, label.getY());;
			}
			break;
		case KeyEvent.VK_SPACE:
			label.setLocation(label.getX(), 300);
		}
	}
	public void keyTyped(KeyEvent e){
		if(e.getKeyChar()==KeyEvent.VK_S){
			System.exit(0);
		}
	}
	public void keyReleased(KeyEvent e){}

}
