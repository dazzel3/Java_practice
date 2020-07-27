package miniproject3;

import miniproject3.Member;
import java.util.Iterator;
import java.util.TreeSet;



public class SortedManager {
	
	//To-do ȸ���� �����Ͽ� �����ϱ� ���� TreeSet�� Ȱ���մϴ�.
	private TreeSet<Member> treeSet;
	
	public SortedManager() {
		treeSet = new TreeSet<Member>();
	}
	
	//To-do ȸ���� �߰��ϴ� �޼��带 ����ϴ�.
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	//To-do ȸ���� �����ϴ� �޼��带 ����ϴ�.
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"��ȣ�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	//To-do ��� ȸ���� �����ִ� �޼��带 ���� �մϴ�.
	public void showAllMember() {
		for (Member member: treeSet) {
			System.out.println(member.getMemberName());
		}
		System.out.println();
	}
		
	//To-do ȸ�������� �������� getter�� �����մϴ�.
	public TreeSet<Member> getMemberList() {
		return treeSet;
	}
}
