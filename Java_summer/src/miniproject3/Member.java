package miniproject3;

import miniproject3.Member;

public class Member implements Comparable<Member> {
	
	
	//Todo �Ϲ� ȸ�� Ŭ������ �Ӽ��� ���̵�, �̸�, ���(FAMILY) ������ �Դϴ�.
	protected int memberId;
	protected String memberName;
	protected String grade;
	
	public Member() {
		
	}
		
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
		
		//To-do �Ϲ� ����� �⺻ ����� FAMILY�� ����� �ݴϴ�.
		grade="FAMILY";
	}
		
		
	// To-do �Ϲ� ȸ�� Ŭ������ �� �Ӽ��� getter/setter�� �����մϴ�.
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
		
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String showMemberInfo() {
		// To-do ȸ�� ������ �����ִ� showMemberInfo �޼��带 �����մϴ�.
		return getMemberName()+"ȸ�� ���� ȸ�� ���̵�� "+getMemberId()+"�̸�, ����� "+getGrade()+"�Դϴ�.";
	}

	//To-do ȸ���� �̸� ������ �����ϱ� ���� Comparable �޼��带 �����մϴ�.
	@Override
	public int compareTo(Member member) {
		return this.getMemberName().compareTo(member.getMemberName());
	}

	
}
