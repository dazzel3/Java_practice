package miniproject2;

import java.util.ArrayList;
import java.util.List;

import miniproject2.Hamburger;

public class HamburgerOrderMachine {
	private ArrayList<Hamburger> hamburgerList;

	public HamburgerOrderMachine() {
		// TODO ���⼭ hamburgerList �� �ʱ�ȭ �մϴ�.
		hamburgerList = new ArrayList<Hamburger> ();
	}

	public void order(Hamburger hamburger) {
		// TODO �ֹ� ���� �ܹ��Ÿ� hamburgerList�� �����մϴ�.
		hamburgerList.add(hamburger);
	}

	public int completeOrder() {
		int totalPrice = 0;

		// TODO ���⼭ hamburgerList�� ��ȸ�ϸ�
			//  1)�� �ܹ��ŵ��� ��Ḧ ����ϰ�
			//  2)���ÿ� �� ������ ��ȸ�Ͽ� �ջ��� �� ������ ���� �� return �մϴ�.
		for (Hamburger burger : hamburgerList) {
			System.out.println(burger.getIngredient()+" "+burger.getPrice()+"��");
			totalPrice += burger.getPrice();
		}
		
		return totalPrice;
	}

}
