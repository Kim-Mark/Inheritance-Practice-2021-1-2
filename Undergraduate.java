
public class Undergraduate extends Student{

	
	private String clubname;
	
	
	public Undergraduate() {
		super();
		clubname = "";
	}
	
	public Undergraduate(String Name, int Number, String Clubname) {
		super(Name, Number);
		setClubName(Clubname);
		
	}
	
	
	public void setClubName(String Clubname) {
		this.clubname = Clubname;
	}
	
	
	public String getClubName() {
		return clubname;
	}
	
	
	public String toString() {
		return super.toString() + ", Club name: " + getClubName();
	}
	
	
	public boolean equals(Undergraduate other) {
		return (super.equals(other) && this.clubname.equals(other.clubname));
	}
}
