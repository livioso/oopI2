package introduction;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class mainframeExample02 extends JFrame{
	
	public static void main(String[] args) {
		mainframeExample02 meinFenster = new mainframeExample02();
		meinFenster.setVisible(true);
	}
	
	public mainframeExample02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JButton myButton= new JButton("Hallo"); 
		myButton.setForeground(Color.BLUE); 
		myButton.setBackground(Color.GREEN); 
		myButton.setFont(new Font("Serif", 1, 24));
		
		myButton.addActionListener(
			event -> {
				System.out.println("Hallo Button Pressed");
			});
		
		add(myButton);
		pack();
	}
}