import java.util.Scanner;

public class PracticeTask1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String shotAnswer; 
		String dogName;
		int dogAge;
		String dogbreed;
		boolean dogShot;
		
		Dog d1 = new Dog("", 0, "", false);
		
		d1.setName("Haru");
		d1.setAge(3);
		d1.setBreed("Jindo");
		d1.setBoosterShot(true);
		
		System.out.print("Enter the name: ");
		dogName = sc.next();
		
		System.out.print("Enter the age: ");
		dogAge = sc.nextInt();
		
		System.out.print("Enter the breed: ");
		dogbreed = sc.next();
		
		Dog d2 = new Dog();
		d2.setName(dogName);
		d2.setAge(dogAge);
		d2.setBreed(dogbreed);
		
		System.out.println("Booster Shot?(Y, N) ");
		shotAnswer = sc.next();
		
		if(shotAnswer == "Y") {
			d2.setBoosterShot(true);
		}
		else {
			d2.setBoosterShot(false);
		}
		
		System.out.println("Name: " + d1.getName() + ", Age: " + d1.getAge() + ", Breed: " + d1.getBreed() + ", BoosterShot: " + d1.getBoosterShot());
		System.out.println("Name: " + d2.getName() + ", Age: " + d2.getAge() + ", Breed: " + d2.getBreed() + ", BoosterShot: " + d2.getBoosterShot());
		
		System.out.println();
		System.out.println("Did not get the booster shot");
		System.out.println();
		
		if(d1.getAge() > 2 && d1.getBoosterShot() == false) {
			System.out.println("Name: " + d1.getName() + ", Age: " + d1.getAge());
		}
		else if(d2.getAge() > 2 && d2.getBoosterShot() == false) {
			System.out.println("Name: " + d2.getName() + ", Age: " + d2.getAge());
		}
	}

}
