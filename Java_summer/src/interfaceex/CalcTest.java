package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
	
		CompleteCalc calc1 = new CompleteCalc();
		Calc calc2 = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc1.add(n1, n2));
		System.out.println(calc1.substract(n1, n2));
		System.out.println(calc1.times(n1, n2));
		System.out.println(calc1.divide(n1, n2));
		
		calc1.showInfo();
		
		System.out.println(calc2.add(n1, n2));
		System.out.println(calc2.substract(n1, n2));
		System.out.println(calc2.times(n1, n2));
		System.out.println(calc2.divide(n1, n2));
				
		//calc2.showInfo(); �� �� ���� �ֳĸ� calc2�� Calc������ ����Ǿ��� ������ Calc�ȿ� �ִ� �޼��常 ��밡��
		
		calc1.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
