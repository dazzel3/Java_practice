package miniproject2;

public class BulgogiBurger implements Hamburger {
	private int price = 2000;
	private String ingredient = "Bulgogi";

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
