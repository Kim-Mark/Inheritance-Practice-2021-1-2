
public class TempEmployee extends Employee3{

	protected double payRate;
	private int hoursWorked;
	
	public TempEmployee(String name, String department, double payRate) {
		super(name, department);
		this.payRate = payRate;
	}
	
	public void setHoursWorked() {
		hoursWorked = 0;
	}

	public double pay(){
		
		return payRate * getHoursworked();
	}
	
	public void addHours (int moreHours){
  	
    hoursWorked += moreHours;
	}

	public int getHoursworked() {
	
		return hoursWorked;
	}
	
	public String toString() {
		
    String i = "";
    i += "Name: ";
    i += getName();
    i += ", ";
    i += "Department: ";
    i += getDepartment();
    i += ", ";
    i += "Pay Hour: ";
    i += payRate;
    i += ", ";
    i += "Worked Hour: ";
    i += hoursWorked;
		return i;
	}
	
}
