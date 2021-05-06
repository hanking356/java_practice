package 반복문;

import javax.swing.JOptionPane;

public class practice {

	public static void main(String[] args) {
		int a = 0; // 변수는 초기화를 시켜줘야 한다.
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;

		while (true) {
			String data = JOptionPane.showInputDialog("점수를 입력하세요");
			int data1 = Integer.parseInt(data);
			if (data1 == 0) {
				System.out.println("최종결과");// 이 문장부터 break까지는 while문 끝나고 넣어도 됨
				System.out.println("시스템을 종료합니다");
				System.out.println("60점  미만:" + a + "명");
				System.out.println("60점  이상:" + b + "명");
				System.out.println("70점  이만:" + c + "명");
				System.out.println("80점  이만:" + d + "명");
				System.out.println("90점  이만:" + e + "명");
				System.out.println("--------------------");
				double sum = a + b + c + d + e;
				double total = (sum1 + sum2 + sum3 + sum4 + sum5) /sum;//하나는 double로 해야함
				System.out.println("총" + sum + "명의 평균은" + total + "점");
				break;
			}
			if (data1 < 60) {
				a++;
				sum1 = sum1 + data1;
			} else if (data1 < 70) {
				b++;
				sum2 = sum2 + data1;
			} else if (data1 < 80) {
				c++;
				sum3 = sum3 + data1;
			} else if (data1 < 90) {
				d++;
				sum4 = sum4 + data1;
			} else {
				e++;
				sum5 = sum5 + data1;
			} // else

		} // while

	}// main
}// class
