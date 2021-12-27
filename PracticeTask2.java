
public class PracticeTask2 {

	public static void main(String[] args) {
		
		LetterGradeCourse L1 = new LetterGradeCourse("Programming C");
		L1.setAttendScore(95);
		L1.setAssignScore(98);
		L1.setExamScore(83);
		System.out.println(L1.toString());
		System.out.println(L1.getGrade());
		
		PassFailCourse P1 = new PassFailCourse("Seminar");
		P1.setAttendScore(85);
		P1.setReportScore(92);
		P1.setPtScore(78);
		System.out.println(P1.toString());
		System.out.println(P1.getGrade());
		

	}

}
