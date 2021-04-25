package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TetrisController extends KeyAdapter {
	
	
	//Controller constructor
	public TetrisController() {
		
		
	}
	
	public void keyPressed(KeyEvent e) {
		//Actions if key is pressed
	    switch(e.getKeyCode()) {
	    case KeyEvent.VK_RIGHT: 
	    	System.out.println("The right arrow key is pressed");
	    	break;
	    case KeyEvent.VK_LEFT:
	    	System.out.println("The left arrow key is pressed");
	    	break;
	    };                                                

	}

}
