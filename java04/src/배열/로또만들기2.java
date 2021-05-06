package 배열;

import java.util.Random;

//많은 양의 자동 import: 컨트롤 + 쉬프트 + o(영문)

import java.lang.*;//String,Intenger
public class 로또만들기2 {

	public static void main(String[] args) {
		int[] num = new int[1000];//1002개의 공간이 생김 -> num:1개, 0을 가진 공간 1000개, length를 나타내는 공간 1개,
		Random r = new Random(42);//씨앗(seed),숫자에 따라 생성되는 숫자가 같음
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); //0부터 999사이에서 생성된 숫자를 num 변수에 저장
		}
		
		
		
		int[] count = new int[4];//네 개의 배열을 가진 변수 생성
		
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
			System.out.println(start + "이상 되는 개수는" + count[i]);
			start -= 100;
		}
		
		

	
	}

}
