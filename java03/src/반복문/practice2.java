package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class practice2 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);//0~99
		//int target = 55;
		int count = 0;
		
		while (true) {
			int data = Integer.parseInt(JOptionPane.showInputDialog("���� �Է¶�:"));
			if (data == target) {
				System.out.println("���ϵ帳�ϴ�.");
				System.out.println("�����Դϴ�.");
				System.out.println("���� Ƚ����:" + count);
				break;
			}else {
				System.err.println("������ �ƴմϴ�.");
				if (data < target) {
					System.out.println("���亸�� �������Դϴ�.");
				} else {
					System.out.println("���亸�� ū���Դϴ�.");
				}
			}
			count++;
			
		}
		
	}// main
}// class
