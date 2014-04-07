package listener;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Mouselistener extends JFrame implements MouseListener {
	/** */
	private static final long serialVersionUID = 7385711546840277923L;

	public Mouselistener() {
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(300,300));
		
		// because we also implement this
		// e.g. mouseClicked, mousePressed, ...
		this.addMouseListener(this);
		
		this.setLayout(new GridLayout(5,2));
		this.setVisible(true);
		this.setSize(300, 300);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}
	
	public static void main(String[] args) {
		new Mouselistener();	
	}
}
