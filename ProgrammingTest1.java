
public class ProgrammingTest1 {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(5);
		
		Circle c1 = new Circle();
		c1.setX(1);
		c1.setY(4);
		c1.setR(5);
		
		Cylinder cl1 = new Cylinder(9);
		cl1.setX(2);
		cl1.setY(3);
		cl1.setR(7);
		
		System.out.println(p1.toString());
		System.out.println(c1.toString());
		System.out.println(cl1.toString());

	}

}
