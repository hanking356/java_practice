package Ŭ�������;

import java.sql.Driver;
import java.util.Date;

import Ŭ���������.��ȯ������;

public class ��ȯ���޾ƺ��� {

	public static void main(String[] args) {
		��ȯ������ re = new ��ȯ������();
		re.add2();
		//void�� �޼��带 ȣ���ϴ� ��쿡�� ������ �� ������� ���� �� ����
		//����Ʈ�� �ȵȴ�.
		
		//�޼��带 ȣ�⤩�ϰ� ���� ��ȯ���� ��������.
		//String rest = re.add2();
		//System.out.println(re.add2());
		
		System.out.println(re.add(200, 100));
		System.out.println(re.add(33.3, 50));
		System.out.println(re.add("�����ð���", "���ɽð�"));
		System.out.println(re.add(100, "�� ���� ��ѹ�"));
		int[] sum = re.add();
		for (int x : sum) {
			System.out.println(x);
			
		}
		//String s;//�Ϲ�Ŭ������ �������� Ÿ������ ��� ����
//		Date name = new Date(); //�̷��� �ϸ� �ȵ� �̹� ��ü ������ä�� ��������
		Date d = re.getDate();
		System.out.println(d);
		
		
		
	}

}
