package miniproject1;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		
		// TODO i�� 1���� 100���� �ݺ��Ǿ�� �մϴ�. // ���ڸ� 1 ������Ŵ
    	for (int i=1;i<=100;i++){ 
            int secondNumber = 0; // TODO 1�� �ڸ� ���ڸ� ��Ÿ���ϴ�.
            secondNumber = i % 10;
            
            int firstNumber = 0;  // TODO 10�� �ڸ� ���ڸ� ��Ÿ���ϴ�.
            firstNumber = i / 10;
            
            boolean is306090 = true; // TODO ������ 10�� �ڸ����� 3,6,9�� �ش� �Ǵ����� Ȯ�����ּ���
            boolean is369 = true;  
            
            
            
            if ((firstNumber % 3) == 0 && (firstNumber != 0)) {
            	is306090 = true;
            	
            	
            }
            else {
            	is306090 = false;
            }
            
            // TODO ������ 1�� �ڸ����� 3,6,9�� �ش� �Ǵ����� Ȯ�����ּ���
            
            if ((secondNumber % 3) == 0 && (secondNumber != 0) ) {
            	is369 = true;
            	
            }
            else {
            	is369 = false;
            }

            
            // TODO ���ڰ� 33, 36, 39, 63, 66, 69, 93, 96, 99�� �ش�Ǵ� ��� '**'�� ��µ˴ϴ�. System.out.println("**")
            // TODO ���ڿ� 3, 6, 9�� �ѹ� ���ԵǴ� ��� '*'�� ��µ˴ϴ�. System.out.println("*")
            // ���ڿ� 3, 6, 9�� ���� ���� ��� ���ڰ� ��µ˴ϴ�.
            
            if (is369 && is306090) {
            	System.out.println("**");
            }
            else if (is369 || is306090) {
            	System.out.println("*");
            }
            else {
            	System.out.println(i);
            }
            
            
            
    	}
	}

}
