package inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.print("�Է� �� '��'�̶�� ������:");
		
		try {
			int i;
			//������Ʈ�� - ����Ʈ�� �����Ÿ� ���ڷ� �ٲ���
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '��') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
