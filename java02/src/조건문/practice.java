package ���ǹ�;

import javax.swing.JOptionPane;

public class practice {

	public static void main(String[] args) {
		// ���� �׸�:����/���/Ŀ��
		// ����� vip�Դϱ�? yes/no

		// ���ڶ�� ����̱���!
		// ����̸� �����̱���!
		// �װ͵� �ƴ϶�� ������ �򱺿�!

		// vip�̸�, ���űݾ׿��� 1000���� �����Ͽ� ���� �ƴϸ�, ���űݾ� ��� ����

		String buy = JOptionPane.showInputDialog("���� �׸�");//buy ������ �Է°��� ����
		String vip = JOptionPane.showInputDialog("����� vip�Դϱ�?");//vip ������ �Է°��� ����
		int money = 5000; //���� money�� 5000������ ������ ���� 

		String result = ""; //
		if (buy.equals("����")) {
			result = "����̱���";
		} else if (buy.equals("����")) {
			result = "�����̱���!";
		} else {
			result = "������ �򱺿�!";
		}

		
		if (vip.equals("yes")) {
			money = money - 1000;
		} else {
			
		}
		JOptionPane.showMessageDialog(null, result + money + "��");	
	}
}