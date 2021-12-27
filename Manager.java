
public class Manager extends Employee{

	protected double bonus;
	
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	
	public double getBonus() {
		return bonus;
	}
	
	
	public void raiseSalary() {
		salary = salary * 1.2;
	}
	
	

}
