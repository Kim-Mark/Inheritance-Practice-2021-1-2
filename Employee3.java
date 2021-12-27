
public class Employee3 {

	public String name;
	public String department;
	
	
	
	public Employee3(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	

	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Department: " + getDepartment();
	}
}
