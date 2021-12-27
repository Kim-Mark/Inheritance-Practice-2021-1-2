
public class Dog extends Pet{

	private String breed; 
	private boolean boosterShot; 
	
	public Dog() {
		super();
		breed = "";
		boosterShot = false;
	}
	
	public Dog(String name, int age, String breed, boolean boosterShot) {
		super(name, age);
		this.breed = breed;
		this.boosterShot = boosterShot;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean getBoosterShot() {
		return boosterShot;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Age: " + getAge() + ", Breed: " + getBreed() + ", Booster shot: " + getBoosterShot();
	}
}
