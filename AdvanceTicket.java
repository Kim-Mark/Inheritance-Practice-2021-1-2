
public class AdvanceTicket extends Ticket{

	
	private int advancedays;
	
	
	public AdvanceTicket(int number, int advancedays) {
		super(number);
		this.advancedays = advancedays;
	}
	
	
	public double getPrice() {
		if(advancedays >= 30) {
			price = price * 0.5;
		}
		else if(advancedays >= 10) {
			price = price * 0.8;
		}
		else if(advancedays >= 5) {
			price = price * 0.9;
		}
		return price;
	}
	
	
	public int getAdvancedays() {
		return advancedays;
	}
	
	
	public String toString() {
		String i = "";
		i += "Number: " + getNumber();
		i += ", ";
		i += "Advance days: " + getAdvancedays();
		i += ", ";
		i += "Price: " + getPrice();
		return i;
	}
}
