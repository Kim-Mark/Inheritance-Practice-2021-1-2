
public class Ticket {

	
	protected int number;
	protected double price;
	
	
	public Ticket(int number) {
		this.number = number;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Number: " + number + ", Price: " + price;
	}
}
