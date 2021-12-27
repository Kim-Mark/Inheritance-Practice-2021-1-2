
public class PracticeTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepEmployee employeeOne; 
		TempEmployee employeeTwo; 
		
		employeeOne = new RepEmployee("Kim","Marketing",6000, 0.4);
		System.out.println(employeeOne.toString());
		
		System.out.println(employeeOne.pay());
		
		
		employeeTwo = new TempEmployee("Jane", "Development", 1);
		System.out.println(employeeTwo.getHoursworked());
		//0
		employeeTwo.addHours(300);
		System.out.println(employeeTwo.getHoursworked());
		//300
		
		System.out.println(employeeTwo.toString());
		
		System.out.println(employeeTwo.pay());
		//300.0
		System.out.println(employeeTwo.toString());
		
	}

}
