package core.java.basics;

public class CallGraphicObject {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.moveTo(10, 20);
		rectangle.draw();
		rectangle.resize();
		
		GraphicObject circle = new Circle();
		circle.moveTo(30, 40);
		circle.draw();
		circle.resize();
		
		
		System.out.println("****** Interface *******");
		
		Drawable drawable = new Circle1();
		drawable.draw();
		drawable.resize();
		
	}

}
