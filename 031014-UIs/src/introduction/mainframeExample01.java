package introduction;

import java.awt.*;
import javax.swing.*;

public class mainframeExample01 {
	
	public static void main(String[] args) {
		JLabel msgLabel = new JLabel();
		JButton noButton = new JButton(); 
		
		msgLabel.setText("Mwhahaahhaha");
		noButton.setText("no");
		
		JFrame win = new JFrame("Message");
		JPanel buttonbox = new JPanel();
		     
		win.getContentPane().setLayout(new BorderLayout()); buttonbox.setLayout(new FlowLayout()); buttonbox.add(noButton);
		     
		win.getContentPane().add(msgLabel, "Center");
		win.getContentPane().add(buttonbox, "South");
		
		win.setVisible(true);
	}
}