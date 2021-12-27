
public class Course {

	protected String courseName;
	protected int attendScore;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	
	
	public void setAttendScore(int attendScore) {
		this.attendScore = attendScore;
	}
	
	
	public int getAttendScore() {
		return attendScore;
	}
	
	
	public String getGrade() {
		String I = "";
		return I;
	}
	
	
	public String toString() {
		return "Course name: " + getCourseName() + ", Attendance score: " + getAttendScore();
	}
	
}
