package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001,"lee");
		
		lee.addSubject("����", 100);
		lee.addSubject("����", 90);
		
		Student kim = new Student(1002,"kim");
		
		kim.addSubject("����", 100);
		kim.addSubject("����", 90);
		kim.addSubject("����", 80);
		
		
		lee.showStudentInfo();
		System.out.println("===============================");
		kim.showStudentInfo();
		
	}

}
