package Ŭ��������;

public class Phone {
	String Color;
	String Shape;
	
	public void Call() {
		System.out.println("��ȭ�� �޽��ϴ�.");
	}
	public void Text(String x, String y, int z) {
		//x, y, z�� �Ķ����, �Ű�����
		//����, Ÿ��, ���� �� ���߾�� ��
		System.out.println(x + "����" + y +"���" + z + "�ÿ� ��ȭ��� �����ϴ�.");
		System.out.println("���ڸ� �����ϴ�.");
	}
	public void internet(String x, int y) {
		System.out.println(x + "�� ����" + y +"�ð� �����ߴ�.");
	}

}
