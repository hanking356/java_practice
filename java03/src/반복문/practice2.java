package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class practice2 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);//0~99
		//int target = 55;
		int count = 0;
		
		while (true) {
			int data = Integer.parseInt(JOptionPane.showInputDialog("정답 입력란:"));
			if (data == target) {
				System.out.println("축하드립니다.");
				System.out.println("정답입니다.");
				System.out.println("시행 횟수는:" + count);
				break;
			}else {
				System.err.println("정답이 아닙니다.");
				if (data < target) {
					System.out.println("정답보다 작은값입니다.");
				} else {
					System.out.println("정답보다 큰값입니다.");
				}
			}
			count++;
			
		}
		
	}// main
}// class
