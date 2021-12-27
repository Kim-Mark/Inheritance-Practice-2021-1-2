
public class Point{
	private int x_coordinate;
	private int y_coordinate;
	
	public Point() {
		this.x_coordinate = 0;
		this.y_coordinate = 0;
	}
	
	public void setX(int x) {
		this.x_coordinate = x;
	}
	
	public void setY(int y) {
		this.y_coordinate = y;
	}
	
	public int getX() {
		return x_coordinate;
	}
	
	public int getY() {
		return y_coordinate;
	}

	public String toString() {
		return "[" + getX() + ", " + getY() + "]";
	}
}
