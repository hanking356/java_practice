package ���;

public class ���۸� extends �� {
	//��� ���� 3, ����޼��� 2
	
	boolean fly;
	
	public void ���ָ�����() {
		System.out.println("�̸���" + name + "���۸��� �������� ���ָ� ����.");
	}

	@Override
	//��ӹ޾Ҵ� �޼��� �߿��� �޼����� ����� �������ؼ� ����� �� ����
	//�������̵�(�ż��� ������)
	public String toString() {
		return "���۸� [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
}
