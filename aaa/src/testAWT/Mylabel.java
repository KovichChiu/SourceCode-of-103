package testAWT;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mylabel extends JLabel {
	public void setColor(int i){
		switch(i){
		case 0:
			this.setBackground(Color.WHITE);
			break;
		case 1:
			this.setBackground(Color.BLUE);
			break;
		case 2:
			this.setBackground(Color.GREEN);
			break;
		case 3:
			this.setBackground(Color.RED);
			break;
		case 4:
			this.setBackground(Color.ORANGE);
			break;
		case 5:
			this.setBackground(Color.PINK);
			break;
		case 6:
			this.setBackground(Color.YELLOW);
			break;
		case 7:
			this.setBackground(Color.DARK_GRAY);
			break;
			
		case 8:
			this.setBackground(Color.BLUE);
			break;
		case 9:
			this.setBackground(Color.GREEN);
			break;
		case 10:
			this.setBackground(Color.RED);
			break;
		case 11:
			this.setBackground(Color.ORANGE);
			break;
		case 12:
			this.setBackground(Color.PINK);
			break;
		case 13:
			this.setBackground(Color.YELLOW);
			break;
		case 14:
			this.setBackground(Color.DARK_GRAY);
			break;
		}
		
	}
}
