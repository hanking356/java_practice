package ��������;

public class Phone {
	String color;
	int size;
	
	public Phone(String color, int size) {
		//this��� �ǹ̴� �ش� Ŭ������ �ǹ�
		//this.color: �ش� Ŭ���� �ٷ� ���� ����� color��� �ǹ�
		//this�� ���������� ������ �� �ִ�.
		//�������� ����/������ ������ �� ���������� ������ �������� ���
		this.color = color;
		this.size = size;
	}
	
	
	public void internet() {
		System.out.println("���ͳ��ϴ�.");
	}
	public void text() {
		System.out.println("�����ϴ�.");
	}
	@Override//������ �θ� toString�� ����� ������
	public String toString() {
		return "Phone [color=" + color + ", size=" + size + "]";
	}
	
}
