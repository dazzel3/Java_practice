package miniproject3;

public class VIPMember extends Member {
	
	// To-do VIPMember�� Member���� ����� �޽��ϴ�.
		// To-do ���� ���� ���̵� �Ӽ��� �߰��մϴ�.
	
	private int agentId;
	
		
	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	public VIPMember() {
		
	}
		
	public VIPMember(int memberId, String memberName, int agentId) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.agentId = agentId;
		// To-do ����� VIP�� ������ �ݴϴ�.
		grade = "VIP";
	}

	@Override
	public String showMemberInfo() {
		// TODO Auto-generated method stub
		return super.showMemberInfo()+" ���� ��ȣ�� "+getAgentId()+"�Դϴ�.";
	}
	
	
}
