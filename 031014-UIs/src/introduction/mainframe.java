package introduction;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class mainframe {
	
	public static void main(String[] args) {
		JLabel msgLabel = new JLabel(); // Komponenten instanzieren JButton yesButton = new JButton();
		JButton noButton = new JButton(); 
		msgLabel.setText("Mwhahaahhaha"); // Komponenten konfektionieren msgLabel.setBorder(new EmptyBorder(10,10,10,10)); yesButton.setText("yes");
		noButton.setText("no");
		// Container für die Komponenten erstellen
		     JFrame win = new JFrame("Message");
		     JPanel buttonbox = new JPanel();
		// Layout-Manager aufsetzen
		win.getContentPane().setLayout(new BorderLayout()); buttonbox.setLayout(new FlowLayout()); buttonbox.add(noButton); // Komponenten in Container einfügen buttonbox.add(noButton);
		// Layouts plazieren
		     win.getContentPane().add(msgLabel, "Center");
		     win.getContentPane().add(buttonbox, "South");
		// Event-Handling: innere Klassen! win.setSize(300,120); // GUI anzeigen
		     win.setVisible(true);
		   }

}