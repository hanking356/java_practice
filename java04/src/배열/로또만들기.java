package 배열;

import java.util.Random;

//많은 양의 자동 import: 컨트롤 + 쉬프트 + o(영문)
public class 로또만들기 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random(45);//씨앗(seed)
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
