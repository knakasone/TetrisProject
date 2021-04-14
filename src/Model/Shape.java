package Model;
import java.util.ArrayList;

public class Shape {
	
	//Shape type and color
	String type;
	String color;
	
	//Values for the main (topmost or leftmost) position of the Shape
	Position shapePosition;
	
	//Number of boxes that make up a shape
	public static int numBoxes = 4;
	public ArrayList<Position> shapePosList = new ArrayList<Position> ();

	//Shape constructor
	public Shape() {
		
		//default shape type and color
		this.type = "I";
		this.color = "white";
		
		//default shape position
		shapePosition = new Position(0, 0);
		
		//set default position list
		defaultShapePoslist();
	}
	
	//initialize shapePosList (List of Shape positions)
	public void defaultShapePoslist() {
		Position defaultPos = new Position(0,0);
		
		for (int i = 0; i < numBoxes; i++) {
			shapePosList.add(defaultPos);
		}
	}
	
	//get color of shape
	public String getShapeColor() {
		return this.color;
	}
	
	//given a color sets the color of the shape
	public void setShapeColor(String col) {
		this.color = col;
	}
	
	//get color of shape
	public String getShapeType() {
		return this.type;
	}
	
	//given a color sets the color of the shape
	public void setShapeType(String type) {
		this.type = type;
	}
	
	//returns the current shape's main position
	public Position getShapePosition() {
		return this.shapePosition;
	}
	
	//given two integers, set shape position 
	public void setShapePosition(int x, int y) {
		this.shapePosition.setPosition(x, y);
	}

	//given a Position, sets shape position
	public void setShapePosition(Position pos) {
		this.shapePosition = pos;
	}
	
	//Given three positions, sets the second, third, and fourth position in the ShapePosList
	public void setShapePosList(Position pos2, Position pos3, Position pos4) {
		Position mainPos = this.shapePosition;
		
		shapePosList.set(0, mainPos);
		shapePosList.set(1, pos2);
		shapePosList.set(2, pos3);
		shapePosList.set(3, pos4);
	}
	
	//Returns the shapePosList
	public ArrayList<Position> getShapePosList() {
		return this.shapePosList;
	}
	
	//set the positions of each shape based on their type
	public void setShapePosByType() {
		Position mainPos = shapePosition;
		String shapeType = this.type;
		
		int mainPosX = mainPos.getPosX();
		int mainPosY = mainPos.getPosY();
		
		Position secondPos = shapePosition;
		Position thirdPos = shapePosition;
		Position fourthPos = shapePosition;
		
		switch (shapeType) {
			case "I": 
				secondPos.setPosition(mainPosX, mainPosY + 1);
				thirdPos.setPosition(mainPosX, mainPosY + 2);
				fourthPos.setPosition(mainPosX, mainPosY + 3);
			case "O": 
				secondPos.setPosition(mainPosX + 1, mainPosY);
				thirdPos.setPosition(mainPosX, mainPosY + 1);
				fourthPos.setPosition(mainPosX + 1, mainPosY + 1);
			case "T":
				secondPos.setPosition(mainPosX + 1, mainPosY);
				thirdPos.setPosition(mainPosX + 2, mainPosY);
				fourthPos.setPosition(mainPosX + 1, mainPosY + 1);
			case "S":
				secondPos.setPosition(mainPosX + 1, mainPosY);
				thirdPos.setPosition(mainPosX, mainPosY + 1);
				fourthPos.setPosition(mainPosX - 1, mainPosY + 1);
			case "Z":
				secondPos.setPosition(mainPosX + 1, mainPosY);
				thirdPos.setPosition(mainPosX + 1, mainPosY + 1);
				fourthPos.setPosition(mainPosX + 2, mainPosY + 1);
			case "J":
				secondPos.setPosition(mainPosX, mainPosY + 1);
				thirdPos.setPosition(mainPosX + 1, mainPosY + 1);
				fourthPos.setPosition(mainPosX + 2, mainPosY + 1);
			case "L": 
				secondPos.setPosition(mainPosX + 1, mainPosY);
				thirdPos.setPosition(mainPosX + 2, mainPosY);
				fourthPos.setPosition(mainPosX + 2, mainPosY - 1);
		}
		
		setShapePosList(secondPos, thirdPos, fourthPos);
		
	}
	
}
