import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Game extends JFrame{
	public Game() {
		initialize();
	}
	private void initialize() {
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		setVisible(true);
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(50);
		flowLayout.setHgap(100);
		getContentPane().add(panel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		setBounds(100, 100, 519, 349);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
