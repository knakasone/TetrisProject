package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Exception;

public class TetrisModel {
	
	//board dimensions
	public static int boardWidth = 10;
	public static int boardHeight = 20;
	public int [][] grid = new int[boardHeight][boardWidth];
	
	public static int score = 0; 
	
	Shape fallingShape;
	Shape nextShape;
	
//	//List of shape types
//	private static ArrayList<String> shapeTypeList = new ArrayList<String>(Arrays.asList(
//						"I",
//						"O",
//						"T",
//						"S",
//						"Z",
//						"J",
//						"L")); 
	
	//Tetris Model constructor
	public TetrisModel() {
		
		//initialize falling shape and next shape
		initializeBoard();
		printBoard();
	}
	
	//prints the board returns board as a string
	public String printBoard() {
		String str = "";
		//System.out.println("    0 1 2 3 4 5 6 7 8 9");
		str = str + "    0 1 2 3 4 5 6 7 8 9 \r\n";
		for (int i = 0; i < boardHeight; i++) {
			if (i >= 10) {
				//System.out.print(i + ": ");
				str = str + i + ": ";
			} else {
				//System.out.print(i + ":  ");
				str = str + i + ":  ";
			}
			for (int j = 0; j < boardWidth; j++) {
				//System.out.print(grid[i][j] + " ");
				str = str + grid[i][j] + " ";
			}
			//System.out.println("");
			str = str + "\r\n";
		}
		return str;
	}
	
	//initialize the empty Tetris board 
	public void initializeBoard() {
		for (int i = 0; i < boardHeight; i++) {
			for (int j = 0; j < boardWidth; j++) {
				grid[i][j] = 0;
			}
		}
	}
	
	//given a position and a value, sets the value of the given position
	public void setGridSpace(Position pos, int value) {
		int i = pos.getPosX();
		int j = pos.getPosY();
		this.grid[i][j] = value;
	}
	
	//returns a random shape
	public Shape getRandomShape() {
		String randomShapeType;
		Shape newShape = new Shape();
		
		int numShapeTypes = newShape.getShapeTypeListSize();
		
		//generate random number between 0 and the size of the shapeTypeList (number of shape types)
		int randomShapeNum = 0;
		randomShapeNum = (int) (Math.random()*((numShapeTypes - 1) + 1)) + 1;
		
		randomShapeType = newShape.getShapeType(randomShapeNum);
		
		newShape.setShapeType(randomShapeType);
		
		return newShape;
	}
	
	//sets the given shape as the falling shape
	public void setFallingShape(Shape shape) {
		this.fallingShape = shape;
	}
	
	//sets the given shape as the next shape
	public void setNextShape(Shape shape) {
		this.nextShape = shape;
	}
	
	
	//Given a position, checks if the given shape's next move is valid
	public boolean validMove(Position nextPos, Shape currShape) {
		boolean canMove = false;
		
		ArrayList<Position> currPosList = currShape.getShapePosList(); 
		int numPositions = currPosList.size();
		
		//checks if the main position is valid, check the rest of the positions
		if (checkPosition(nextPos)) {
			for(int i = 0; i < numPositions; i++) {
				if (checkPosition(currPosList.get(i))) {
					canMove = true;
				} else {
					canMove = false;
					break;
				}
			}
		} else {
			canMove = false;
		}
		
		return canMove;
	}
	
	//check if the given position is within the board and does not conflict with other positions on the board
	public boolean checkPosition(Position Pos) {
		boolean validPos = false;
		
		int PosX = Pos.getPosX();
		int PosY = Pos.getPosY();
		
		if (PosX < 0 || PosX > boardWidth - 1 || PosY < 0 || PosY > boardHeight - 1) {
			validPos = false;
			throw new IllegalArgumentException("Position is out of board boundaries");
		} else if (this.grid[PosX][PosY] == 0) {
			validPos = true;
		}
		
		return validPos;
	}
	
	//given a direction, moves the falling shape in the given direction
	public void moveShape(String direction) {
		Position currPosition = this.fallingShape.getShapePosition();
		Position nextPosition = this.fallingShape.getShapePosition();
		
		//sets the next position based on the move direction
		switch(direction) {
			case "down":
				nextPosition.setPosition(currPosition.getPosX(), currPosition.getPosY() + 1);
			case "right":
				nextPosition.setPosition(currPosition.getPosX() + 1, currPosition.getPosY());
			case "left":
				nextPosition.setPosition(currPosition.getPosX() - 1, currPosition.getPosY());
		}
		
		//if the next position is valid, sets the falling shape's position to the next valid position
		if(validMove(nextPosition, this.fallingShape)) {
			this.fallingShape.setShapePosition(nextPosition);
		}
	}
	
	//given a shape and a position, places the shape
	public void placeShape(Position pos, Shape shape) {
		shape.setShapePosition(pos);
	}
	
}

















