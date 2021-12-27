
public class LetterGradeCourse extends Course{

	int assignScore;
	int examScore;
	
	public LetterGradeCourse(String cname) {
		super(cname);
	}
	
	
	public void setAssignScore(int newAssignScore) {
		this.assignScore = newAssignScore;
	}
	
	public void setExamScore(int newExamScore) {
		this.examScore = newExamScore;
	}
	
	public int getAttendScore() {
		return attendScore;
	}
	
	public int getAssignScore() {
		return assignScore;
	}
	
	public int getExamScore() {
		return examScore;
	}
	
	// 총점
	public double getTotal() {
		int total = 0;
		total += getAttendScore() * 0.2;
		total += getAssignScore() * 0.3;
		total += getExamScore() * 0.5;
		return total;
		
	}
	
	
	public String getGrade() {
		String I = "";
		if(getTotal() >= 90) {
			return I + "A";
		}
		else if(getTotal() >= 80 && getTotal() < 90) {
			return I + "B";
		}
		else if(getTotal() >= 70 && getTotal() < 80) {
			return I + "C";
		}
		else if(getTotal() >= 60 && getTotal() < 70) {
			return I + "D";
		}
		else {
			return I + "F";
		}
	}
	
	// 정보 반환
	public String toString() {
		return "Course name: " + getCourseName() + ", Attendance Score: " + getAttendScore() + ", Assign Score: " + getAssignScore() + ", test score: " + getExamScore();
	}
	

}
