
public class Student {

	private String name;
	private int number;
	
	
	public Student() {
		name = "";
		number = 0;
	}
	
	public Student(String Name, int Number) {
		this.name = Name;
		this.number = Number;
	}
	
	
	public void setName(String Name) {
		name = Name;
	}
	
	public void setNumber(int Number) {
		number = Number;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int getNumber() {
		return number;
	}
	
	
	public String toString() {
		String i = "";
		i += "Name: ";
		i += getName();
		i += ", ";
		i += "Number: ";
		i += getNumber();
		return i;
	}
	
	
	public boolean equals(Student other) {
		return (this.name.equals(other.name) && (this.number == other.number));
	}
}
