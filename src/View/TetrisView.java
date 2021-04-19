package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TetrisView {
	
	int width = 10;
	int height = 20;
	
	//Tetris board constructor
	public TetrisView() {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Tetris");
	
	//Set the size of the GUI
	//panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
	//panel.setLayout(new GridLayout(10, 10));
	//panel.setBackground(Color.gray);
	
	//sets original size of the window
	frame.setPreferredSize(new Dimension(500,500));
	frame.add(panel, BorderLayout.CENTER);
	
	//cannot resize the window
	frame.setResizable(false);
	
	//If you close the window, the program will stop
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Title of the window
	frame.setTitle("Tetris but with a better color palette");
	
	//make the GUI the same size as the game
	frame.pack();
	
	//Position GUI to center of screen
	frame.setLocationRelativeTo(null);
	
	//make window visible to user
	frame.setVisible(true);
	
	//adds button to view
	panel.add(button);
	
	

	}
	
	
	
}	