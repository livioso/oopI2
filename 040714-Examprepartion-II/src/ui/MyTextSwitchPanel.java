package ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyTextSwitchPanel extends JPanel implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel l1= new JLabel(); 
	private JLabel l2= new JLabel(); 
	private JLabel l3= new JLabel(); 
	private String text;
	
	public void setText(String text) { 
		this.text = text; 
		l1.setText(text); 
		l2.setText(text); 
		l3.setText(text);
	}
	
	public MyTextSwitchPanel() {
		this.setLayout(new GridLayout(3, 1));
    	this.add(l1);
    	this.add(l2);
    	this.add(l3);
		l1.addMouseListener(this);
		l2.addMouseListener(this);
		l3.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource().equals(l1)) {
			l1.setText("");
		} else if (e.getSource().equals(l2)) {
			l2.setText("");
		} else if (e.getSource().equals(l3)){
			l3.setText("");
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource().equals(l1)) {
			l1.setText(text);
		} else if (e.getSource().equals(l2)) {
			l2.setText(text);
		} else if (e.getSource().equals(l3)) {
			l3.setText(text);
		}
		
	}
}
