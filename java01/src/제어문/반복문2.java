package 제어문;

import javax.swing.JOptionPane;

public class 반복문2 {

	public static void main(String[] args) {
		// 입력
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		
		//처리
		String result = name + "님 환영합니다.";	
		
		//출력
		JOptionPane.showMessageDialog(null, "나는 실행 결과출력하는 곳");
	}

}
