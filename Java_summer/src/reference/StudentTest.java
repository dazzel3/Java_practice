package reference;

public class StudentTest {

	public static void main(String[] args) {

		
		Student studentLee = new Student(101, "Lee");
		studentLee.setKoreanSubject("����", 90);
		studentLee.setMathSubject("����", 100);
		
		
		Student studentKim = new Student(102,"Kim");
		studentKim.setKoreanSubject("����", 70);
		studentKim.setMathSubject("����", 80);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}
}
