package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "������");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "����");
		customerKim.bonusPoint = 10000;
		
		GOLDCustomer customerCho = new GOLDCustomer(10030, "������");
		customerCho.bonusPoint = 10000;
		
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		int priceCho = customerCho.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo()+" ������ �ݾ��� "+priceLee+"�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo()+" ������ �ݾ��� "+priceKim+"�� �Դϴ�.");
		System.out.println(customerCho.showCustomerInfo()+" ������ �ݾ��� "+priceCho+"�� �Դϴ�.");
	}

}
