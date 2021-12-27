
public class PassFailCourse extends Course{

	int reportScore;
	int ptScore;
	
	public PassFailCourse(String cname) {
		super(cname);
		// TODO Auto-generated constructor stub
	}
	
	public void setReportScore(int reportScore) {
		this.reportScore = reportScore;
	}
	
	public void setPtScore(int ptScore) {
		this.ptScore = ptScore;
	}
	
	public int getReportScore() {
		return reportScore;
	}
	
	public int getPtScore() {
		return ptScore;
	}

	public int getAttendScore() {
		return attendScore;
	}
	
	
	public double getTotal() {
		int total = 0;
		total += getAttendScore() * 0.2;
		total += getReportScore() * 0.6;
		total += getPtScore() * 0.2;
		return total;
	}
	
	public String toString() {
		return "Coursename: " + getCourseName() + ", Attend Score: " + getAttendScore() + ", Report Score: " + getReportScore() + ", PPT score: " + getPtScore();
	}
	
	public String getGrade() {
		String I = "";
		if(getTotal() >= 60) {
			return I + "CR";
		}
		else {
			return I + "NC";
		}
	}
	
}
