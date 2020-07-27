package miniproject3;

import java.util.ArrayList;

public class ListManager {
	
	private ArrayList<Member> memberList;
	//To-do ȸ�� ������ ���� ArrayList�� Ȱ���ϰ�, ȸ���� �߰�,����, ���ȸ���� �����ִ� ������ ����� �����մϴ�.
	
	
	//To-do �����ڸ� ���� ���ο� �������Ʈ�� ����ϴ�.
	public ListManager() {
		memberList = new ArrayList<Member>();
	}
	
	//To-do ȸ���� �߰��ϴ� �޼��带 ����ϴ�.
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	//To-do ȸ���� �����ϴ� �޼��带 ����ϴ�.
	public void removeMember(Member member) {
		memberList.remove(member);
	}
	
	//To-do ��� ȸ���� �����ִ� �޼��带 ���� �մϴ�.
	public void showAllMember() {
		for (Member m : memberList) {
			System.out.println(m.showMemberInfo());
		}
	}
	
	//To-do ȸ�������� �������� getter�� �����մϴ�.
	public ArrayList<Member> getMemberList() {
		return memberList;
	}
	
}
