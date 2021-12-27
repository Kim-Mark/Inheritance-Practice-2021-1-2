
public class WalkupTicket extends Ticket{

	
	private boolean paybyCredit;
	

	public WalkupTicket(int number, boolean paybyCredit) {
		super(number);
		this.paybyCredit = paybyCredit;
	}
	
	
	public double getPrice() {
		if(paybyCredit) {
			return price * 1.05;
		}
		else {
			return price;
		}
	}
	
	
	public boolean getpaybyCredit() {
		return paybyCredit;
	}
	

	public String toString() {
		String i = "";
		i += "Number: " + getNumber();
		i += ", Pay By Credit: " + getpaybyCredit();
		i += ", Price: " + getPrice();
		return i;
	}
}
