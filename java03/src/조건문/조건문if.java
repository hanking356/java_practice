package ���ǹ�;

import java.util.Date;

public class ���ǹ�if {

	public static void main(String[] args) {
		// newŰ���带 �̿��ؼ� DateƲ�� ���� ��ǰ�� ��.
		Date date = new Date(); //��¥�� �ð��� ���� ������ �˷��ִ� class, ������ �κ��� Ʋ�� ��
		int hour = date.getHours();//Date Ŭ������ getHours�޼ҵ� ���
		System.out.println("���� �ð���" + hour +"��");
		
		//������ true�̸�, �����ϰ� �ű⼭ break!
		//if~else if�� break����� ����.
		if (hour<=11) {
			System.out.println("�¸��");
		}else if (hour<=16) {
			System.out.println("�¾�����");
		}else if (hour<=22) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
		}
	}

}
