package ui;
import java.awt.*;

import javax.swing.JFrame;

public class LogoPainter extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LogoPainter() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("GUI-Testaufgabe");
		this.pack();
    	this.setVisible(true);
    	this.setSize(200,200);
	}
	
	public void paintLogo(Graphics g, Color c, int size, int x, int y) {
		if (c.equals(Color.WHITE)) {
			c = Color.LIGHT_GRAY;
		}
		g.setColor(c);
		g.fillRect(x, y, size, size);
		g.setColor(Color.WHITE);
		g.fillOval(x, y, size, size);
		g.setColor(Color.BLACK);
		g.fillRect(x+size/2-5, y+size/2-5, 10, 10);
	}	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		paintLogo(g, Color.BLUE, 100, 30, 40);
	}
	
	public static void main(String[] args) {
		new LogoPainter();

	}

}
