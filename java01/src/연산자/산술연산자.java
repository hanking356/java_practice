package ������;

public class ��������� {

	public static void main(String[] args) {
		// ���������: + - * / %
		// ���ٺ��� : ��Ʈ�� + ��Ʈ +ȭ��ǥ �Ʒ�
		//���� ����: ��Ʈ�� + d
		//���� �̵�: ��Ʈ + ȭ��ǥ ����
		int x = 200;
		int y = 100;
		
		//����:cpu�� �ϴ� ������ ó��
		//������(��ȣ): ������ ó���� �ڵ��� ��ȣ�� ǥ��
		int sum = x + y;
		System.out.println(x + "+" + y + " = " + sum);
		int minus = x - y;
		System.out.println(x + "-" + y + " = " + minus);
		int mul = x * y;
		System.out.println(x + "*" + y + " = " + mul);
		int div = x / y;
		System.out.println(x + "/" + y + " = " + div);
		int odd = x % y;
		System.out.println(x + "&" + y + " = " + odd);
	}

}
