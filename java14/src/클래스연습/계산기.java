package Ŭ��������;

import java.util.Date;

public class ���� {
	
	public int getHour() {
		Date date = new Date();
		int result = date.getHours();//12
		return result;
	}
	public int add(int x, int y) {
		//�޼���ȿ��� ����� ������ �޼��� �ȿ����� ��밡��
		//�޼��� ���� �����ȿ����� ��밡��
		//���� ����, ���ú��� <-->��������, �۷ι� ����
		int result = x + y;
		return result;
	}

	public int minus(int x, int y) {
		int result = x - y;
		return result;
		
	}
	
	public int mul(int x, int y) {
		int result = x * y;
		return result;//return�� �� ���ٿ�!
	}

	public int div(int x, int y) {
		int result = x / y;
		return result;
	}

}
