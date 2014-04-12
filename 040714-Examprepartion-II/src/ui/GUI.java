package ui;

import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*;

public class GUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton b1= new JButton("löschen");
	JButton b2= new JButton("übernehmen");
	JTextArea t1 = new JTextArea("asdf");
	
	MyTextSwitchPanel mtsp= new MyTextSwitchPanel();
	   
	public GUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("GUI-Testaufgabe");

		this.pack();
    	this.setVisible(true);
    	this.setSize(300,200);
    	
    	b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
			}
		});
    	b2.addActionListener(new MyButtonListener());
    	
    	GridLayout grid = new GridLayout(1, 2);
    	this.setLayout(grid);
    	JPanel left = new JPanel();
    	left.setLayout(new GridLayout(3, 1));
    	left.add(b1);
    	left.add(t1);
    	left.add(b2);
    	this.add(left, BorderLayout.WEST);
    	
    	mtsp.setLayout(new GridLayout(3,1));
    	this.add(mtsp, BorderLayout.EAST);
    	 
	}	
	
	public class MyButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			mtsp.setText(t1.getText());
		}
		
	}
	
	public static void main(String[] args) {
		new GUI();
	}
}
