package thisex;

public class PersonTest {

	public static void main(String[] args) {

		Person personNoName = new Person();
		personNoName.showInfo();
		
		
		Person personLee = new Person("�̹�ȣ",20);
		personLee.showInfo();
		System.out.println(personLee);
		
		//this�� ���������� ����Ű�� ���� ����
		Person p = personLee.getSelf();
		System.out.println(p);
		
	}

}
