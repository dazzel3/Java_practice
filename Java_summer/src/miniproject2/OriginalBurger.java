package miniproject2;

public class OriginalBurger implements Hamburger {
	private int price = 1000;
	private String ingredient = "Ham";
	
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