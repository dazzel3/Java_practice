package cooperation;

public class BeanCoffee {
	
	int money;
	
	public String buy(int money) {
		this.money = money;
		
		if (money == Menu.BEANAMERICANO) {
			return "��ī�� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if (money == Menu.BEANLATTE) {
			return "��ī�� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
