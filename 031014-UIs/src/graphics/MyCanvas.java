package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyCanvas extends Canvas implements MouseListener{
	private int oldX;
	private int oldY;
	private int enterX;
	private int enterY;
	ArrayList<Line> al;
	Color myCol;
	
	public MyCanvas(){
		this.addMouseListener(this);
		al = new ArrayList<Line>();
		//loadLines();
		this.setBackground(new Color(255,255,255));
		myCol= new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
	}
	
	@Override
	public void paint(Graphics g){
		g.setColor(myCol);
		int h= this.getHeight();
		int w= this.getWidth();
		int[] xpos= {10, w/2, w-10, w/2};
		int[] ypos= {h/2, 10, h/2, h-10};
		//g.drawPolygon(xpos, ypos, 4);
		for (int i=0; i<al.size(); i++){
			Line l= al.get(i);
			g.drawLine(l.x1, l.y1, l.x2, l.y2);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		myCol= new Color((int)(Math.random()*255),
			(int)(Math.random()*255),(int)(Math.random()*255));
		this.getGraphics().drawString("hier", e.getX(), e.getY());
		if (e.getClickCount()>1){
			System.out.println("mehr als einmal");
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		enterX= e.getX();
		enterY= e.getY();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		al.add(new Line(enterX, enterY, e.getX(), e.getY()));
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		oldX= e.getX();
		oldY= e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		al.add(new Line(oldX, oldY, e.getX(), e.getY()));
		repaint();
	}
	
	class Line{
		int x1;
		int x2;
		int y1;
		int y2;
		Line(int x1, int y1, int x2, int y2){
			this.x1= x1;
			this.x2= x2;
			this.y1= y1;
			this.y2= y2;
		}
		void paint(Graphics g){
			g.drawLine(x1, y1, x2, y2);
		}
	}
	
}
