package base;

public class Order {

	public long orderNumber;
	public String personID;
	public String orderDate;
	public String personName;
	public String orderProductNumber;
	public String orderAddress;
	
	public void showInfo() {
		System.out.println("�ֹ� ��ȣ: "+orderNumber);
		System.out.println("�ֹ��� ���̵�: "+personID);
		System.out.println("�ֹ� ��¥: "+orderDate);
		System.out.println("�ֹ��� �̸�: "+personName);
		System.out.println("�ֹ� ��ǰ ��ȣ: "+orderProductNumber);
		System.out.println("��� �ּ�: "+orderAddress);
	}
}
