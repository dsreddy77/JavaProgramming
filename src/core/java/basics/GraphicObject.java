package core.java.basics;

public abstract class GraphicObject{
    int x, y;
    void moveTo(int newX, int newY) {
    	System.out.println("Move object to position x="+newX+" y="+newY);
    }
    
    abstract void draw();
    abstract void resize();
}
