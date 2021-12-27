
public class Executive extends Manager{

	private double stockOption;
	
	public Executive(String name, double salary, double bonus, double stockOption) {
		super(name, salary, bonus);
		this.stockOption = stockOption;
	}
	
	
	public double getStockOption() {
		return stockOption;
	}
	

	public void raiseSalary(){
		salary = salary * 1.1;
	}

}
