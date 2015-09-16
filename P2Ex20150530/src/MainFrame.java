import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MainFrame extends JFrame{
	private Container cp;
	private JPanel jpnl;
	private JPanel jpnr;
	private JLabel[][] jlbs = new JLabel[20][10];
	private Timer t1;
	private int[][] data = new int[20][10];
	
	private int y = 0;
	
	public MainFrame(){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				data[i][j] = 0;
			}
		}
		
		data[0][3] = 1;
		data[0][4] = 1;
		data[1][3] = 1;
		
		initComp();
		t1.start();
	}
	private void initComp(){
		setBounds(200, 100, 600, 600);
		cp = this.getContentPane();
		cp.setLayout(new BorderLayout(3,3));
		jpnl = new JPanel(new GridLayout(20, 10, 1, 1));
		cp.add(jpnl, BorderLayout.WEST);
		jpnr = new JPanel(new GridLayout(20, 10, 1, 1));
		cp.add(jpnr, BorderLayout.EAST);
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				jlbs[i][j] = new JLabel("　　");
				jlbs[i][j].setOpaque(true);
				jlbs[i][j].setBackground(Color.gray);
				jpnl.add(jlbs[i][j]);
			}
		}
		t1 = new Timer(600, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(y<18){
					data[y][3] = 0;
					data[y][4] = 0;
					data[y+1][3] = 0;
					y++;
					data[y][3] = 1;
					data[y][4] = 1;
					data[y+1][3] = 1;
				}else{
					t1.stop();
				}
				redraw();
			}
		});
	}
	private void redraw(){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				switch(data[i][j]){
				case 0: // Gray
					jlbs[i][j].setBackground(Color.gray);
					break;
				case 1: // set label to RED
					jlbs[i][j].setBackground(Color.red);
					break;
				case 2: // set label to Green
					jlbs[i][j].setBackground(Color.green);
					break;
				case 3: // set label to Blue
					jlbs[i][j].setBackground(Color.blue);
					break;
				}
			}
		}
	}
}
