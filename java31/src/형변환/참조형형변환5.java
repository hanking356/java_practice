package ����ȯ;

import java.util.ArrayList;
import java.util.Random;

public class ����������ȯ5 {	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//�ڵ�����ȯ Object�� ��ȯ!
		//�ڵ�����ȯ�� ����: �ΰ������� �߰��� ��ɵ��� �� �� ����.
		list.add("ȫ�浿");//0�� �ε���
		list.add(100);//int(�⺻��)----auto-boxing---->Integer(������)---upcasting-->Object
		list.add(11.2);
		
		int num = (Integer)list.get(1);
		//int(�⺻��)< ---auto-boxing-----Integer(������)<---downcasting--Object
		System.out.println(list);
		
	}
}
