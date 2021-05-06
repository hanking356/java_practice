package 배열응용;

import javax.swing.JOptionPane;

public class 여러개숫자입력 {

	public static void main(String[] args) {
		int[] num = new int[3];//3개의 int형 공간을 가진 배열 생성 
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력");//"100"
			//int<--String:Integer
			int data2 = Integer.parseInt(data);//Integer는 자주 쓰이므로 객체 생성 할 필요 없, data는 입력값
			//double d = Double.parseDouble(data);
			num[i] = data2;//기본형은 기본형끼리만, 참조형은 참조형끼리만 Casting			
		}
		for (int x : num) {//num값을 x의 변수로 하나씩 꺼내서 출력
			System.out.println(x+ " ");
		}
		int sum = 0;//변수 만들어서 처음값을 넣어주는 것 =>초기화!
		//변수 만들 때 초기화를 꼭 해주어야 한다.
		for (int x : num) {//num값을 x의 변수로 하나씩 꺼내기
			sum = x + sum;//하나씩 꺼낸 x를 더해서 새롭게 저장
		}
		System.out.println(sum /(double)num.length);//num.length룰 실수로 변환해서 계산 ->연산후 실수 값이 나옴
	}

}
