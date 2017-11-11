package core.java.basics;

public class Rectangle extends GraphicObject {

	@Override
	public void draw() {
		System.out.println("draw method in Rectangle");
	}

	@Override
	public void resize() {
		System.out.println("resize method in Rectangle");
	}
}
