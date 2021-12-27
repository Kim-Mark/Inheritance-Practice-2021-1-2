
public class Pet {

	private String name;
	private int age;
	
	
	public Pet() {
		this.name = "";
		this.age = 0;
	}
	
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Age: " + getAge();
	}
}
