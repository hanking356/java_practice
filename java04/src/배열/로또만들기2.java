package �迭;

import java.util.Random;

//���� ���� �ڵ� import: ��Ʈ�� + ����Ʈ + o(����)

import java.lang.*;//String,Intenger
public class �ζǸ����2 {

	public static void main(String[] args) {
		int[] num = new int[1000];//1002���� ������ ���� -> num:1��, 0�� ���� ���� 1000��, length�� ��Ÿ���� ���� 1��,
		Random r = new Random(42);//����(seed),���ڿ� ���� �����Ǵ� ���ڰ� ����
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); //0���� 999���̿��� ������ ���ڸ� num ������ ����
		}
		
		
		
		int[] count = new int[4];//�� ���� �迭�� ���� ���� ����
		
		for (int x : num) {//
			if (x>=600) {
				count[0]++;
			}if (x>=500) {
				count[1]++;
			}if (x>=400) {
				count[2]++;
			}if (x>=300) {
				count[3]++;
			}
		}
		int start = 600; 
		for (int i = 0; i < count.length; i++) {
			System.out.println(start + "�̻� �Ǵ� ������" + count[i]);
			start -= 100;
		}
		
		

	
	}

}
