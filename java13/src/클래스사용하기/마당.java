package Ŭ��������ϱ�;

import Ŭ���������.PUP;

public class ���� {

	public static void main(String[] args) {
		//pup1, pup2�ִ� �ּҰ� �� ����
		PUP pup1 = new PUP();
		//pup1, color, type�� ����� ��
		//pup1 �ȿ� color, type�� ����Ű�� �ִ� �ּҰ� �����
		PUP pup2 = new PUP();
		//pup2, color, type��  ����� ��
		
		
		pup1.color = "����";
		//pup1�� �ּҰ� ����Ű�� color ������ "����"�� �����Ѵ�.
		//public���� �������� ������ �ٸ���Ű�������� not visible
		pup1.type = "������";
		pup1.bark();
		
		
	}

}
