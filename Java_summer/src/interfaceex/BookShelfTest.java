package interfaceex;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("�Ҽ�1");
		bookQueue.enQueue("�Ҽ�2");
		bookQueue.enQueue("�Ҽ�3");
		
		System.out.println(bookQueue.getSize());
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
		System.out.println(bookQueue.getSize());
	}

}
