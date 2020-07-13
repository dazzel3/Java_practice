package miniproject2;

import miniproject2.BulgogiBurger;
import miniproject2.CheeseBurger;
import miniproject2.ChickenBurger;
import miniproject2.OriginalBurger;
import miniproject2.HamburgerOrderMachine;

public class Main {
	public static void main(String[] args) {
		
		//���� ��
		HamburgerOrderMachine hamburgerOrderMachine1 = new HamburgerOrderMachine();
		hamburgerOrderMachine1.order(new BulgogiBurger());
		hamburgerOrderMachine1.order(new CheeseBurger());
		int totalPrice1 = hamburgerOrderMachine1.completeOrder();
		System.out.println("ù��° �ֹ��� " + totalPrice1 + "�� �Դϴ�.");

		//���� ��
		HamburgerOrderMachine hamburgerOrderMachine2 = new HamburgerOrderMachine();
		hamburgerOrderMachine2.order(new OriginalBurger());
		hamburgerOrderMachine2.order(new ChickenBurger());
		hamburgerOrderMachine2.order(new ChickenBurger());
		
		int totalPrice2 = hamburgerOrderMachine2.completeOrder();
		//�� �հ� ����
		
		System.out.println("�ι�° �ֹ��� " + totalPrice2 + "�� �Դϴ�.");
		
		
		
	}
}
