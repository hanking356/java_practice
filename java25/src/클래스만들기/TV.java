package Ŭ���������;

public class TV {
	//�������
	//����:ram�� ������ �����Ǵ� ��.
	//    ������ ��ġ�� ������ ��� �� �� �ִ� ������ ����
	//public ���������ڸ� ��� �縥 ��Ű�������� ��� ����
	public int ch;
	public int vol;
	public boolean onOFF;
	public void on() {
		System.out.println("tv�� �Ѵ�");
	}
	public void off() {
		System.out.println("tv�� ����");
	}
	public void changeCH() {
		System.out.println("ä���� �ٲٴ�.");
	}
	//������ ������ �ִ� �޼��带 ����� ������, ������ �ִ� �޼��带 �Ȱ��� ���ָ� �ȴ�.
	
	//�������̵�(������), override : ��� ���� �޼��� �߿��� ����� �������ؼ� ���
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOFF=" + onOFF + "]";
	}
}
