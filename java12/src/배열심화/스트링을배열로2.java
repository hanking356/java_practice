package �迭��ȭ;

public class ��Ʈ�����迭��2 {

	public static void main(String[] args) {
		String all = "����, ����, ����, ��ǻ��";

		// 1. String[]�� �ٲپ����.
		String[] all2 = all.split(",");//{"����"," ����"," ����"," ��ǻ��"}
		// 2. �ٲپ����� ������ ���ԵǾ� �ִٸ�, ������ ��� ���� ��, �ٽ� �迭�� ��������.
		for (int i = 0; i < all2.length; i++) {
			System.out.println(all2[i]);
		}
		for (int i = 0; i < all2.length; i++) {
			all2[i] = all2[i].trim();
		}

		// 3. �������?
		System.out.println("������� " + all2.length + "����");

		// 4. ��ǻ���� ��ġ��?
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("��ǻ��")) {
				System.out.println("��ǻ���� ��ġ��:" + ((int) i + 1) + "��°");
			}
		}

		// 5. ������� 3���� �̸��� �������?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length() < 3) {// all2[i]�� String�̹Ƿ� length()
				count++;
			}
		}
		System.out.println("3���� �̸� ������� " + count + "��");

	}

}
