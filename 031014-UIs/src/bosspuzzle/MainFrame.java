package bosspuzzle;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	/** List of nine buttons that form a grid of 3x3 buttons */
	List<JButton> controlButtons = new ArrayList<>();
	
	/** Button that starts a new game */
	JButton startNewGameButton = new JButton("Start");

	/** Game title label */
	JLabel gameTitleLabel = new JLabel("BLABLA");
	
	/** Game output label */
	JLabel gameOutputLabel = new JLabel("Output");
	
	JPanel buttonPanel = new JPanel(new GridLayout(3,3,10,10));
	JPanel controlPanel = new JPanel(new GridLayout(1,2));
	
	public MainFrame() {
		
		setLayout(new BorderLayout());
		add(buttonPanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(gameTitleLabel, BorderLayout.NORTH);
		
		addGridButtons();
		addControlPanelComponents();
	
	}
	
	private void addControlPanelComponents() {
		startNewGameButton.addActionListener(
			ae -> { 
				mixButtons();
		});
		
		controlPanel.add(startNewGameButton);
		controlPanel.add(gameOutputLabel);	
	}

	private void addGridButtons() {
		for(Integer i = 1; i <= 9; i++) {
			JButton newControlButton = new JButton(i.toString());
			controlButtons.add(newControlButton);
			buttonPanel.add(newControlButton);
		}
	}

	private void mixButtons() {
		
	}
	
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
	}
}