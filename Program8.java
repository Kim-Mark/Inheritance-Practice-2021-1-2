
public class Program8 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Bill Gates", 100000.0);
		Manager mang1 = new Manager("Elon Musk", 200000.0, 5000.0);
		Executive exe1 = new Executive("Lee", 300000.0, 100000.0, 50000.0);
		
		
		emp1.raiseSalary();
		mang1.raiseSalary();
		exe1.raiseSalary();
		
		System.out.println(emp1.getName() + ": Salary = " + emp1.getSalary());
		System.out.println(mang1.getName() + ": Salary  = " + mang1.getSalary() + " Bonus = " + mang1.getBonus());
		System.out.println(exe1.getName() + ": Salary = " + exe1.getSalary() + "  Bonus = " + exe1.getBonus() + " Stock Option = " + exe1.getStockOption());

	}

}
