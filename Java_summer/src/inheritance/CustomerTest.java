package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "������");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "����");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//��ĳ����: ����Ŭ�������� ������ ����ȯ (���� �������� ����)
		// VIPCustomer() �����ڸ� ȣ���߱� ������ �ν��Ͻ��� ��� ������
		// customerCho�� Ÿ���� Customer�̱� ������ ���ٰ����� ������ �޼���� Customer�� ������ �޼��常 ����
		Customer customerCho = new VIPCustomer(10030, "������");
	}

}
