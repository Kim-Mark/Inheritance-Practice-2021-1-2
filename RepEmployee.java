
public class RepEmployee extends Employee3{

	protected double yearlySalary;
	protected double bonusRate;
	
	public RepEmployee(String name, String department, double yearlySalary, double bonusRate) {
		super(name, department);
		this.yearlySalary = yearlySalary;
		this.bonusRate = bonusRate;
	}
	
	
	public double pay() {
		return yearlySalary / 12.0 * (1.0 + bonusRate);
	}
	
	public String toString() {
		 String i = "";
		    i += "Name: ";
		    i += getName();
		    i += ", ";
		    i += "Department: ";
		    i += getDepartment();
		    i += ", ";
		    i += "Y salary: ";
		    i += yearlySalary;
		    i += ", ";
		    i += "Bonus rate: ";
		    i += bonusRate;
		    
			return i;
	}

	
}
