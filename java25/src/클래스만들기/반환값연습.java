package Ŭ���������;

import java.util.Date;

public class ��ȯ������ {
	public void add2() {
		System.out.println("���ϱ� ����� �����ϰڽ��ϴ�.");
	}
	public int add(int x, int y) {//double
		return x + y;
	}
	public double add(double x, int y) {//�ϳ��� double�̸� ������ double
		return x + y;
	}
	public String add(String x, String y) {
		return x + y;
	}
	public String add(int x, String y) {
		return x + y;
	}
	public int[] add() {
		int [] x = {1,2,3};
		return x;
	}
	public Date getDate() {
		Date date = new Date();
		return date;
	}
}
