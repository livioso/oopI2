package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Polygon4 extends JFrame{
	
	public Polygon4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("GUI-Testaufgabe");
		this.pack();
    	this.setVisible(true);
    	this.setSize(200,200);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		paintLogo(g);
	};
	
	void paintLogo (Graphics g) {
		g.setColor(Color.BLACK);
		
		// so the format of the parameters
		// is like that :)
		// g.drawLine(x1, y1, x2, y2);
		
		g.drawLine(50, 20, 100, 60);
		g.drawLine(100, 60, 50, 60);
		g.drawLine(100, 60, 50, 60);
	
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Polygon4();
	}
}
