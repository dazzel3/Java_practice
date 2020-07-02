package inheritance_polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "������");
		Customer customerShin = new Customer(10020, "�ų���");
		Customer customerHong = new GOLDCustomer(10030, "ȫ�浿");
		Customer customerCho = new GOLDCustomer(10040, "������");
		Customer customerKim = new VIPCustomer(10050, "����", 1234);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerCho);
		customerList.add(customerKim);
		
		System.out.println("====== �� ���� ��� ======");
		
		for (Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== ���ΰ� ���ʽ� ����Ʈ ���� ======");
		
		int price = 10000;
		
		for (Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"���� "+cost+"�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ� ����Ʈ�� "+customer.bonusPoint+"�� �Դϴ�.");
		} 
		
		
	}

}
