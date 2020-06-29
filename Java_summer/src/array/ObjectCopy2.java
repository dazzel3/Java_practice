package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�������� ����1","���ֿ�");
		library[1] = new Book("�������� ����2","���ֿ�");
		library[2] = new Book("�������� ����3","���ֿ�");
		library[3] = new Book("�������� ����4","���ֿ�");
		library[4] = new Book("�������� ����5","���ֿ�");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		
		//���� ����: �ּҰ� ����Ǵ°� �ƴ϶� �ƿ� ���� ��ü�� ����ǰ� �� ��ü �迭���� ���� ������ ���� �����ϸ� ������ �����
		for (int i=0; i<library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("��ǻ�Ͱ���");
		library[0].setAuthor("����ö");
		
		for (Book book: library) {
			book.showBookInfo();
		}
		
		System.out.println("==================");
		
		for (Book book: copyLibrary) {
			book.showBookInfo();
		}
		
		
		
	}

}
