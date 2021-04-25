package Test;

import static org.junit.Assert.*;

import Model.Shape;

import org.junit.Test;

public class ShapeTest {
	
	Shape defaultShape = new Shape();

	@Test
	public void defaultShape() {
		
		
		assertEquals(defaultShape.getShapeColor(), "white");
		assertEquals(defaultShape.getShapeType(), "I");
		assertEquals(defaultShape.getShapePosition().getPosX(), 0);
		assertEquals(defaultShape.getShapePosition().getPosY(), 0);
	}

}
