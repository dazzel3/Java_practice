package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�������� ����1","���ֿ�");
		library[1] = new Book("�������� ����2","���ֿ�");
		library[2] = new Book("�������� ����3","���ֿ�");
		library[3] = new Book("�������� ����4","���ֿ�");
		library[4] = new Book("�������� ����5","���ֿ�");
		
		
		
		//���� ����: �ּҸ� ����� �׷��� ������ �迭�� �ٲ㵵 ī�Ǻ��� ���� �ٲ����� �ֳĸ� ���� �ּҸ� ����Ű�ϱ�
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
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
