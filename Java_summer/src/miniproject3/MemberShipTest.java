package miniproject3;

import java.util.List;
import miniproject3.ListManager;
import miniproject3.SortedManager;
import miniproject3.Member;
import miniproject3.VIPMember;
import miniproject3.SalesPriceReport;


public class MemberShipTest {

	public static void main(String[] args) {
		Member memberKim = new Member(1001, "Kim");
		Member memberLee = new Member(1002, "Lee");
		Member memberSong = new Member(1003, "Song");
		
		VIPMember memberPark = new VIPMember(1004, "Park", 123);
		VIPMember memberSeo = new VIPMember(1005, "Seo", 456);
		VIPMember memberHan = new VIPMember(1006, "Han", 789);
		
		// ListManager �� ��� ���� ����
		
		ListManager listManager = new ListManager();
		listManager.addMember(memberKim);
		listManager.addMember(memberLee);
		listManager.addMember(memberSong);
		listManager.addMember(memberPark);
		listManager.addMember(memberSeo);
		listManager.addMember(memberHan);
	
		
		// ��� ���� ������ ���
	
		listManager.showAllMember();
		System.out.println("==========================================================");
		System.out.println();
			
		
		List<Member> list = listManager.getMemberList(); 
		SalesPriceReport salesReport = new SalesPriceReport(list);
		
		System.out.println("100000 ���� ¥�� ������ �춧 Member �� VIPMember �� ������ ����ϱ�"); 
		salesReport.generateSaleReport(100000); 
		System.out.println("250000 ���� ¥�� ������ �춧 Member �� VIPMember �� ������ ����ϱ�"); 
		salesReport.generateSaleReport(250000);
			
		
		// ��� ����� �̸� ������ ����ϼ���
		
		System.out.println("��� ����� �̸������� ����ϼ���");
		SortedManager sortedManager = new SortedManager();
		sortedManager.addMember(memberKim);
		sortedManager.addMember(memberLee);
		sortedManager.addMember(memberSong);
		sortedManager.addMember(memberPark);
		sortedManager.addMember(memberSeo);
		sortedManager.addMember(memberHan);
		sortedManager.showAllMember();
		
		
	}

	}


