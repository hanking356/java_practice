package ����ȯ;

public class �⺻������ȯ3 {

	public static void main(String[] args) {
		int sum = 333;
		int count = 5;
		//����� ���� ���, �ϳ��� double�̸� 
		//����� double��
		double avg = (double)sum/count;
		//333�� 333.0, 333.0/5 =>66.6
		double avg2 = (double)(sum/count);//���������� ����� ������ int!
		//���������� ����� �����ؼ� double�� ����ȯ�� ��!
		//6.0 <-----(double)6

	}

}
