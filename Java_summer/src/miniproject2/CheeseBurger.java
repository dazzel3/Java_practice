package miniproject2;

public class CheeseBurger implements Hamburger {
	private int price = 1500;
	private String ingredient = "Cheese";

	//To-do �������̽����� ���� �޼��带 �������Ͽ� �����մϴ�.
		@Override
		public int getPrice() {
			return price;
		}
		@Override
		public String getIngredient() {
			return ingredient;
		}
}
