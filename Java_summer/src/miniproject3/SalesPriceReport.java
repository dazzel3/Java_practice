package miniproject3;


import java.util.List;

public class SalesPriceReport {
	
	List<Member> list;
	
	double ratio = 0.0;
	SalesRatio salesStrategy[] = {new BasicSalesRatio(), new VIPSalesRatio()};
	// FAMILY ��ް� VIP ����� ������ ������ 2������ �����մϴ�.
	
	public SalesPriceReport(List<Member> list) {
		this.list = list;
	}
	
	public void generateSaleReport(int price) {
		
		// To-do ��� FAMILY ����� ȸ����, VIP ����� ȸ���� ������ ������ ����ϴ�.
		
		
		int salePrice = 0;
		
		
		for (Member member : list) {
			// FAMILY ���
			if (member.getGrade() == "FAMILY") {
				ratio = salesStrategy[0].getSalesRatio(price);
				salePrice = price - (int)(price*ratio);
				System.out.print(member.getMemberName()+"�� ");
				System.out.println(member.getGrade()+"��ް� ���ݿ� ���� ���� ������ " + ratio + "�̸�, ������ " + salePrice + "�Դϴ�."); 
			
			//VIP ���	
			} else if (member.getGrade() == "VIP"){
				ratio = salesStrategy[1].getSalesRatio(price);
				salePrice = price - (int)(price*ratio);
				System.out.print(member.getMemberName()+"�� ");
				System.out.println(member.getGrade()+"��ް� ���ݿ� ���� ���� ������ " + ratio + "�̸�, ������ " + salePrice + "�Դϴ�.");
			}
			else {
				System.out.println("error");
			}
		}
	
		
		System.out.println("==========================================================");
		System.out.println();
	
	}
}
