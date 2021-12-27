
public class Circle extends Point{
	
	private int radius;
	
	public Circle(){
		
	}
	
	public Circle(int r) {
		super();
		this.radius = r;
	}
	
	public void setR(int r) {
		this.radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
	
	
	public double getArea() {
		return getRadius() * getRadius() * 3.14;
	}
	
	public String toString() {
		return "Center: " + "[" + getX() + ", " + getY() + "] , Radius: " + getRadius() + "Area: " + getArea();
	}
}
