package �迭����;

import javax.swing.JOptionPane;

public class �����������Է� {

	public static void main(String[] args) {
		int[] num = new int[3];//3���� int�� ������ ���� �迭 ���� 
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("������ �Է�");//"100"
			//int<--String:Integer
			int data2 = Integer.parseInt(data);//Integer�� ���� ���̹Ƿ� ��ü ���� �� �ʿ� ��, data�� �Է°�
			//double d = Double.parseDouble(data);
			num[i] = data2;//�⺻���� �⺻��������, �������� ������������ Casting			
		}
		for (int x : num) {//num���� x�� ������ �ϳ��� ������ ���
			System.out.println(x+ " ");
		}
		int sum = 0;//���� ���� ó������ �־��ִ� �� =>�ʱ�ȭ!
		//���� ���� �� �ʱ�ȭ�� �� ���־�� �Ѵ�.
		for (int x : num) {//num���� x�� ������ �ϳ��� ������
			sum = x + sum;//�ϳ��� ���� x�� ���ؼ� ���Ӱ� ����
		}
		System.out.println(sum /(double)num.length);//num.length�� �Ǽ��� ��ȯ�ؼ� ��� ->������ �Ǽ� ���� ����
	}

}
