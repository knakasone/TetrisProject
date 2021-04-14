package Model;

public class Position {
	int posX;
	int posY;
	
	//Initialize default position
	public Position() {
	
	}
	
	//Initialize default position
	public Position(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	
	//set position
	public void setPosition(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	
	//set X position
	public void setPosX(int x) {
		this.posX = x;
	}
	
	//set Y position
	public void setPosY(int y) {
		this.posY = y;
	}
	
	//get the X positions
	public int getPosX() {
		return this.posX;
	}
	
	//get the Y position
	public int getPosY() {
		return this.posY;
	}
}
