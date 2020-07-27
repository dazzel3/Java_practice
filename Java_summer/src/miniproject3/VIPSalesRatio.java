package miniproject3;

public class VIPSalesRatio implements SalesRatio {

	//To-do VIP ȸ���� ��� 5���� ���ϴ� 0%, 
	//5�������� 10���� ���ϴ� 10%, 10�������� 20���� ���ϴ� 20%, 
	//20���� �̻��� 30%�� ������ �ݴϴ�. 
	
	@Override
	public double getSalesRatio(int price) {
		if (price > 0 && price <= 50000) {
			return 0.0;
		}
		else if (price > 50000 && price <= 100000) {
			return 0.1;
		}
		else if (price > 100000 && price <= 200000) {
			return 0.2;
		}
		else {
			return 0.3;
		}
	}
}
