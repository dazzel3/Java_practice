package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(1001,"Lee");
		
		lee.addBook("�¹���1");
		lee.addBook("�¹���2");
		
		Student kim = new Student(1001,"Kim");
		
		kim.addBook("����1");
		kim.addBook("����2");
		kim.addBook("����3");
		
		Student cho = new Student(1001,"Cho");
		
		cho.addBook("�ظ�����1");
		cho.addBook("�ظ�����2");
		cho.addBook("�ظ�����3");
		cho.addBook("�ظ�����4");
		cho.addBook("�ظ�����5");
		cho.addBook("�ظ�����6");
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		cho.showStudentInfo();
	}

}
