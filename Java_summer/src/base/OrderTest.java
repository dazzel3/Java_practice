package base;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNumber = 201907210001L;
		order.personID = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.personName = "ȫ���";
		order.orderProductNumber = "PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		
		order.showInfo();
		
		
	}

}
