package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.TetrisModel;
import Model.Shape;

public class ModelTest {
	
	TetrisModel newModel = new TetrisModel();
	
	Shape shape = new Shape();

	@Test
	public void testInitialBoard() {
		newModel.initializeBoard();
		assertEquals("    0 1 2 3 4 5 6 7 8 9 \r\n"
				+ "0:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "1:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "2:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "3:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "4:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "5:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "6:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "7:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "8:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "9:  0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "10: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "11: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "12: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "13: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "14: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "15: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "16: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "17: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "18: 0 0 0 0 0 0 0 0 0 0 \r\n"
				+ "19: 0 0 0 0 0 0 0 0 0 0 \r\n", newModel.printBoard());
	}

}
