package lambda;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//���ٽ��� ������ ���ԵǾ� ���Ǵ� ���
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello");
		
		//���ٽ��� �Ű������� ���Ǵ� ���
		showMyString(lambdaStr);
		
		
		//���ٽ��� �޼����� ��ȯ������ ���Ǵ� ���
		PrintString test = returnString();
		test.showString("hello3");
	}
	
	//���ٽ��� �Ű������� ���Ǵ� ���
	public static void showMyString(PrintString p) {
		p.showString("hello2");
	}
	
	//���ٽ��� �޼����� ��ȯ������ ���Ǵ� ���
	public static PrintString returnString() {
		return s -> System.out.println(s+"!!!");
	}

}
