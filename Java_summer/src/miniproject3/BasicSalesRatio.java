package miniproject3;

public class BasicSalesRatio implements SalesRatio {
	
	// To-do  �Ϲ� ȸ���� ��� 5���� ���ϴ� 0%, 
	//5�������� 10���� ���ϴ� 5%, 
	//10�������� 20���� ���ϴ� 10% 20���� �ʰ��� 20% �������ݴϴ�.
	
	@Override
	public double getSalesRatio(int price) {
		if (price > 0 && price <= 50000) {
			return 0.0;
		}
		else if (price > 50000 && price <= 100000) {
			return 0.05;
		}
		else if (price > 100000 && price <= 200000) {
			return 0.1;
		}
		else {
			return 0.2;
		}
	}
	
	
	
}
