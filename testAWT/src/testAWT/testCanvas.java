package testAWT;

import java.awt.*;
import java.awt.event.*;

public class testCanvas extends Canvas {
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 30, 30);
	}
}
