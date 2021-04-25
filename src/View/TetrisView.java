package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TetrisView {
	
	int width = 10;
	int height = 20;
	
	//Tetris board constructor
	public TetrisView() {
	
	JFrame frame = new JFrame();
	JPanel titlePanel = new JPanel();
	JPanel selectPanel = new JPanel();
	JLabel tetrisTitle = new JLabel("<html><h1>Tetris!</h1></html>");
	JButton startGamebutton = new JButton("Start Game");
	
	//Set the size of the GUI
	//panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
	//panel.setLayout(new GridLayout(10, 10));
	titlePanel.setBackground(Color.CYAN);
	
	//sets original size of the window
	frame.setPreferredSize(new Dimension(500,500));
	frame.add(titlePanel, BorderLayout.NORTH);
	frame.add(selectPanel, BorderLayout.CENTER);
	
	//cannot resize the window
	frame.setResizable(false);
	
	//If you close the window, the program will stop
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Title of the window
	frame.setTitle("Tetris but a little worse");
	
	//make the GUI the same size as the game
	frame.pack();
	
	//Position GUI to center of screen
	frame.setLocationRelativeTo(null);
	
	//make window visible to user
	frame.setVisible(true);
	
	//adds elements to panel
	titlePanel.add(tetrisTitle);
	selectPanel.add(startGamebutton, Component.CENTER_ALIGNMENT);
		
	

	}
	
	
	
}	