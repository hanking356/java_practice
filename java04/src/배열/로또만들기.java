package �迭;

import java.util.Random;

//���� ���� �ڵ� import: ��Ʈ�� + ����Ʈ + o(����)
public class �ζǸ���� {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random(45);//����(seed)
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
		}
		for (int x : lotto) {
			System.out.println(x + " ");
		}
		System.out.println();
		int count = 0;
		for (int i : lotto) {
			if(i >= 30) {
				count ++;
			}
		}
		System.out.println(count);
		
	
	}

}
