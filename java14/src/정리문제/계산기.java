package ��������;

import java.util.Date;

public class ���� {
	//return�� �� ���ٿ�!
	public int getHour() {
		Date date = new Date();//Date Ŭ������ Ȱ���� ��ü ����
		int result = date.getHours();//DateŬ������ �ð��� �̾ƿ��� �޼��带 Ȱ���� ���� �ð����� result�� ����
		return result;//result���� int�� ��ȯ��
	}
	public int add(int x, int y) {
		//�޼���ȿ��� ����� ������ �޼��� �ȿ����� ��밡��
		//�޼��� ���� �����ȿ����� ��밡��
		//���� ����, ���ú��� <-->��������, �۷ι� ����
		int result = x + y;//x + y�� ���� int result�� ������
		return result;//result���� int������ ��ȯ��
	}

	public int minus(int x, int y) {
		int result = x - y;//x - y�� ���� int result�� ������
		return result;//result���� int������ ��ȯ��
		
	}
	
	public int mul(int x, int y) {
		int result = x * y;//x * y�� ���� int result�� ������
		return result;//result���� int������ ��ȯ��
	}

	public double div(double x, int y) {
		double result = x / y;//x / y�� ���� int result�� ������
		return result;//result���� int������ ��ȯ��
	}

}
