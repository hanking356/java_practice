package ����ȯ;

import java.util.ArrayList;
import java.util.Random;

public class ����������ȯ2 {	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//�ڵ�����ȯ Object�� ��ȯ!
		//�ڵ�����ȯ�� ����: �ΰ������� �߰��� ��ɵ��� �� �� ����.
		list.add("ȫ�浿");//0�� �ε���
		list.add(new ��());//1�� �ε���
		list.add(new Random());
		list.add(new ���۸�());
		list.add
		System.out.println(list);
		//list.get(0).charAt(0);		
		//list.get(1).run();
		//��Ʈ������ �߰��� �޼������ �ٷ� �� �� ����.
		list.get(0);//�̷��� ���� �ϸ� object
		//String�� �߰� ����� ����ϰ� ������ �ٽ� String���� ����ȯ���ָ� �ȴ�.
		//String(��) <-------Object(ū), (String)����
		String name = (String)list.get(0);
		System.out.println(name.charAt(0));
		
		�� man = (��)list.get(1);
		man.run();
		
	}
}
