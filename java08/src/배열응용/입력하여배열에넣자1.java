package �迭����;

import javax.swing.JOptionPane;

public class �Է��Ͽ��迭������1 {

	public static void main(String[] args) {
		String[] s = new String[3];

		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("�۳⿡ ���� �;��� ��");
		}

		String[] p = new String[3];

		for (int i = 0; i < p.length; i++) {
			p[i] = JOptionPane.showInputDialog("���ؿ� ���� �;��� ��");
		}
		int count = 0;
		for (int i = 0; i < p.length; i++) {
			if (s[i].equals(p[i])) {
				System.out.println("��ġ��" + i + "�� ����");
				System.out.println(s[i]);
				count++;
			}
		}
		System.out.println("���� ��ġ�� ������:" + count);
	}

}
