package ��������;

public class Phone��� {

	public static void main(String[] args) {
		Phone p1 = new Phone("����",7);
//		p1.color = "����";
//		p1.size = 7;
		p1.text();
		System.out.println(p1);
		//Phone [color=" + color + ", size=" + size + "] ->p1�� �� ����
		Phone p2 = new Phone("�Ķ�",5);
//		p2.color = "�Ķ�";
//		p2.size = 5;
		p2.text();
		System.out.println(p2);
	}

}
