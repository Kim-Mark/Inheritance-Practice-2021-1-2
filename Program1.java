
public class Program1 {

	public static void main(String[] args) {
		
		
		Undergraduate under1 = new Undergraduate();
		under1.setName("Kim");
		under1.setNumber(2021052851);
		under1.setClubName("Hycube");
		System.out.println(under1.toString());
		
		Undergraduate under2 = new Undergraduate("Hong", 2022034314, "0°ú1");
		System.out.println(under2.toString());
		
		if(under1.equals(under2)) {
			System.out.println("Same.\n");
		}
		else {
			System.out.println("Different.\n");
		}

	}

}
