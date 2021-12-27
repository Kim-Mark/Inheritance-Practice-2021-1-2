
public class Program2 {

	public static void main(String[] args) {
		
	
		WalkupTicket wt1 = new WalkupTicket(101, true);
		wt1.setPrice(100000);
		System.out.println(wt1.toString());
		
	
		AdvanceTicket at1 = new AdvanceTicket(102, 20);
		at1.setPrice(100000);
		System.out.println(at1.toString());
		
		
		AdvanceTicket at2 = new AdvanceTicket(202, 5);
		at2.setPrice(100000);
		System.out.println(at2.toString());

		
	}

}
