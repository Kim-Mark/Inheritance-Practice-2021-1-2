
public class Graduate extends Student{

	private String typeTa;
	private double scholarRate;
	
	public Graduate() {
		
	}
	
	public Graduate(String name, int num, String typeTa, double scholarRate) {
		super(name, num);
		this.typeTa = typeTa;
		this.scholarRate = scholarRate;
		
	}
	
	
	public void setTypeTa(String TypeTa) {
		this.typeTa = TypeTa;
	}
	
	public void setScholarRate(double ScholarRate) {
		this.scholarRate = ScholarRate;
	}
	
	public String getTypeTa() {
		return typeTa;
	}
	
	public double getScholarRate() {
		return scholarRate;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Number: " + getNumber() + ", Ta: " + getTypeTa() + ", Scholar: " + getScholarRate();
	}
	
}
