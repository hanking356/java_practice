package �迭Ȯ�ι���;

public class ��������Ȯ�� {

	public static void main(String[] args) {
		String[] title = {"����", "����", "����", "����", "��ǻ��"};
		int[] term1 = {100, 90, 70, 30, 50};
		//1�б�, 2�б� ���� ����� ������ �־�� �ϱ� ������ ���� ����! �ʿ�
		int[] term2 = term1.clone();
		term2[3] = 55;
		term2[4] = 77;
		
		System.out.println("1�б⼺��");
		for (int i : term1) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n-------------------------");
		System.out.println("2�б⼺��");
		for (int i : term2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n-------------------------");
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i] ) {
				count++;
			}
		}
		System.out.println("�� ���� �����:" + count + "��");
	
	}

}
