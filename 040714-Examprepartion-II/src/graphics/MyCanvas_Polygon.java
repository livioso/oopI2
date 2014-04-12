package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class MyCanvas_Polygon extends Canvas{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6439556845790651062L;
	private Polygon polygon;
	
	public MyCanvas_Polygon() {
		this.setSize(400, 300);
		this.setBackground(Color.white);
		this.polygon = new Polygon();
	}

	@Override
	public void paint(Graphics g) {
		this.polygon.addPoint(10, this.getHeight()/2);
		this.polygon.addPoint(this.getWidth()/2, this.getHeight()-10);
		this.polygon.addPoint(this.getWidth()-10, this.getHeight()/2);
		this.polygon.addPoint(this.getWidth()/2, 10);
		g.drawPolygon(polygon);
	}
	
}
