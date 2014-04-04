package bosspuzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BossPuzzleMainView extends JFrame {
	
	public class MyWindowAdapter extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	private static final long serialVersionUID = 1L;
	
	/** List of nine buttons that form a grid of 3x3 buttons */
	List<JButton> controlButtons = new ArrayList<>();
	
	/** Button that starts a new game */
	JButton startNewGameButton = new JButton("Start");

	/** Game title label */
	JLabel gameTitleLabel = new JLabel("Welcome");
	
	/** Game output label */
	JLabel gameOutputLabel = new JLabel("Output");
	
	JPanel buttonPanel = new JPanel(new GridLayout(3,3,10,10));
	JPanel controlPanel = new JPanel(new GridLayout(1,2));
	
	public BossPuzzleMainView() {
		setSize(400, 400);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		add(buttonPanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(gameTitleLabel, BorderLayout.NORTH);
		
		addGridButtons();
		addControlPanelComponents();
	
		// sets the window size according 
		// to the components in the JFrame
		pack();
		setVisible(true);
	}
	
	private void addControlPanelComponents() {
		startNewGameButton.addActionListener(
			ae -> { 
				mixButtons();
		});
		
		/** or with a anonymous class 

			startNewGameButton.addActionListener(new ActionListener(){
			     public void actionPerformed(ActionEvent e) {
			       mixButtons();
			     }
			}); 
			
		*/
		
		controlPanel.add(startNewGameButton);
		controlPanel.add(gameOutputLabel);	
	}

	private void addGridButtons() {
		for(Integer i = 1; i <= 9; i++) {
			JButton newControlButton = new JButton(i.toString());
			controlButtons.add(newControlButton);
			buttonPanel.add(newControlButton);
		}
		
		if(!controlButtons.isEmpty()) {
			// remove the last ones label because 
			// this is the whole point of this game
			controlButtons.get(controlButtons.size() - 1).setText("");
		}
	}

	private void mixButtons() {
		
	}
	
	public static void main(String[] args) {
		BossPuzzleMainView mainFrame = new BossPuzzleMainView();
		mainFrame.setVisible(true);
	}
}