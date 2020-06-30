package array;

import java.util.ArrayList;

public class Student {
	
	String studentName;
	int studentID;
	
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for (Subject s: subjectList) {
			total += s.getScore();
			
			System.out.println(studentName+"�л��� "+s.getName()+"������ ������ "+s.getScore()+"�� �Դϴ�.");
		}
		System.out.println(studentName+"�л��� ������ "+total+"�� �Դϴ�.");
	}
}
