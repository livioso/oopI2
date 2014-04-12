package graphics;

import javax.swing.JFrame;

public class main_Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4487060283311472943L;
	
	MyCanvas_Polygon canvas;
	
	public main_Frame() {
		super("Zeichnen mit Maus Events!");
		canvas = new MyCanvas_Polygon();
		add(canvas);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new main_Frame();
	}

}
