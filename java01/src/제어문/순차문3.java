package ���;

import javax.swing.JOptionPane;

public class ������3 {

	public static void main(String[] args) {
		String hobby = JOptionPane.showInputDialog("��̸� �Է��ϼ���");
		String trip = JOptionPane.showInputDialog("�������� �Է��ϼ���");
		//ó��
		String result = "����� " +trip +"��" + hobby + "�� ��ⷯ ����.";	
		
		//���
		JOptionPane.showMessageDialog(null, 
				result); 

		
	}

}
