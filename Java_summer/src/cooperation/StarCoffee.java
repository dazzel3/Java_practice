package cooperation;

public class StarCoffee {
	
	int money;
	
	public String buy(int money) {
		this.money += money;
		
		if (money == Menu.STARAMERICANO) {
			return "��ī�� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if (money == Menu.STARLATTE) {
			return "��ī�� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
