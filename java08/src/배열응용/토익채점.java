package �迭����;

import java.util.Random;

public class ����ä�� {

	public static void main(String[] args) {
		// ����990���, ����
		Random r = new Random(42);

		int[] ��� = new int[990];
		int[] ���� = new int[990];
		// 1~4������ ���� �� �迭�� �־����.
		for (int i = 0; i < ����.length; i++) {
			���[i] = r.nextInt(4) + 1;// 1~4
			����[i] = r.nextInt(4) + 1;
		}
		// ����Ʈ
		int count = 0;
		System.out.println("��ȣ:  ���   ����");
		for (int i = 0; i < ����.length; i++) {
			System.out.println(i + "  :  " + ���[i] + "<->" + ����[i]);
			if (���[i] == ����[i]) {
				count++;
			}
		}
		System.out.println("������:" + count + "��");
	}

}
