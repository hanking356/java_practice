package ��������;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ���Ͽ����� {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("��¥ �Է�");
		String s2 = JOptionPane.showInputDialog("�����Է�");
		String s3 = JOptionPane.showInputDialog("���� �Է�");
		try {		
			//�ش� ������ ��Ʈ��(����)�� �����.
			//��Ʈ���� Ư¡�� �� ����!!
			FileWriter f = new FileWriter("c:/data/" + s1+ ".txt");//��θ� ���� ���� �̸��� ����� ����
			//���� ���: ��ġ�� ��Ÿ���� �� �F�������� �� ���ִ� ���
			//�����: ���� ��ġ�� �����ؼ� ��������� ���ִ� ���
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			f.close(); //��Ʈ���� �� ���� ������ �ݵ�� �ڿ�����!
		} catch (IOException e) {
		System.out.println("���Ϸ� ���� �� �����߻�");
		System.out.println("����������" + e.getMessage());
		}
	}

}
