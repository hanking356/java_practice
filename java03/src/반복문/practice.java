package �ݺ���;

import javax.swing.JOptionPane;

public class practice {

	public static void main(String[] args) {
		int a = 0; // ������ �ʱ�ȭ�� ������� �Ѵ�.
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;

		while (true) {
			String data = JOptionPane.showInputDialog("������ �Է��ϼ���");
			int data1 = Integer.parseInt(data);
			if (data1 == 0) {
				System.out.println("�������");// �� ������� break������ while�� ������ �־ ��
				System.out.println("�ý����� �����մϴ�");
				System.out.println("60��  �̸�:" + a + "��");
				System.out.println("60��  �̻�:" + b + "��");
				System.out.println("70��  �̸�:" + c + "��");
				System.out.println("80��  �̸�:" + d + "��");
				System.out.println("90��  �̸�:" + e + "��");
				System.out.println("--------------------");
				double sum = a + b + c + d + e;
				double total = (sum1 + sum2 + sum3 + sum4 + sum5) /sum;//�ϳ��� double�� �ؾ���
				System.out.println("��" + sum + "���� �����" + total + "��");
				break;
			}
			if (data1 < 60) {
				a++;
				sum1 = sum1 + data1;
			} else if (data1 < 70) {
				b++;
				sum2 = sum2 + data1;
			} else if (data1 < 80) {
				c++;
				sum3 = sum3 + data1;
			} else if (data1 < 90) {
				d++;
				sum4 = sum4 + data1;
			} else {
				e++;
				sum5 = sum5 + data1;
			} // else

		} // while

	}// main
}// class
