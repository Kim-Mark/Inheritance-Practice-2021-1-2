
public class Cylinder extends Circle {
	
	private int height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(int h) {
		super();
		this.height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	public double getArea() {
		return getHeight() * 2 * getRadius() * 3.14 + 4 * getRadius() * 3.14;
	}
	

	public double getVolume() {
		return getRadius() * getRadius() * 3.14 * getHeight();
	}
	

	public String toString() {
		return "Center: [" + getX() + ", " + getY() + "], Radius:" + getRadius() + ", Height:" + getHeight() + "Area:" + getArea() + ", Volume:" + getVolume(); 
	}

}
