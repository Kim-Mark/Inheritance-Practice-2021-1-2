
public class ProgrammingTest7 {

	public static void main(String[] args) {
		
		Undergraduate s1 = new Undergraduate();
		s1.setName("Gildong");
		s1.setNumber(1510);
		s1.setClubName("Robot");
		
		Graduate s2 = new Graduate();
		s2.setName("Sunam");
		s2.setNumber(1601);
		s2.setTypeTa("Ed Ta");
		s2.setScholarRate(1.0);
		
		Graduate s3 = new Graduate();
		s3.setName("Kate");
		s3.setNumber(1624);
		s3.setTypeTa("Dev Ta");
		s3.setScholarRate(0.5);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}

}
