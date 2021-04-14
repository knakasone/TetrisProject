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
	
	panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
	panel.setLayout(new GridLayout(10, 10));
	panel.setBackground(Color.gray);
	
	//sets original size of the window
	frame.setPreferredSize(new Dimension(500,500));
	frame.add(panel, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Tetris but aesthetic?");
	frame.pack();
	frame.setVisible(true);
	
	panel.add(button);
	}
	
	
	
}	