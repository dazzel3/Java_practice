package cooperation;

public class PersonTest {

	public static void main(String[] args) {

		Person kim = new Person("�質��", 10000);
		Person lee = new Person("�̻��", 10000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarAmericano(starCoffee, Menu.STARAMERICANO);
		lee.buyBeanLatte(beanCoffee, Menu.BEANLATTE);
	}

}
