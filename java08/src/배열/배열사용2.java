package �迭;

import java.util.Iterator;

public class �迭���2 {

	public static void main(String[] args) {
		// ���� �˰� �ִ� ���
		String[] name = { "ȫ�浿", "�ڱ浿", "���浿", "�̱浿" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " ");
		}
		System.out.println();
		for (String s : name) {// for each
			System.out.println(s + " ");

		}
		// char ���� �ְ�, ���
		// boolean ��ħ �Ծ��İ� �ְ�, ���
		// double �÷³ְ�, ���
		// int ���� �ְ�, ���
		char[] gender = { '��', '��', '��', '��' };
		for (char s : gender) {
			System.out.println(s + " ");
		}
		double[] eye = { 1.2, 1.5, 1.0, 0.8 };
		for (double i : eye) {
			System.out.print(i + " ");
		}
		System.out.println();
		boolean[] food = { true, false, true, false };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i] + "");
		} // ���� ����
			// �� �����ȿ��� ��������� ������ �����ۿ����� �ν� �Ұ�
			// ������ ��������� ��ġ �����ȿ����� ��� ����!
			// ������ ���� ��������°�? Ÿ�� ������;(����)
			// System.out.println(test);
			// 1. ��Ÿ! �ش� ������ �����ϴ��� Ȯ��
			// 2. Ư���� �����ȿ��� �� �� �ִ� ���������� �ƴϴ���
			// 3. ��� �Ϸ��� �ϴ� ���κ��� �Ʒ����� ������� ���� �ƴ���
			// test�� ��� �Ұ� 38���ο����� ���� test�� ��������� ����

		int test = 100;
		for (boolean b : food) {
			System.out.println(b + "");
		}
		int[] age = { 100, 200, 300, 400 };
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		for (int i : age) {
			System.out.print(i + " ");
			System.out.println(test);
		}

		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + gender[i] + " " + food[i] + " " + eye[i] + " " + age[i]);
		}

	}//main
}//clss
