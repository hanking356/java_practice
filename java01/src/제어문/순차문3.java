package 제어문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String hobby = JOptionPane.showInputDialog("취미를 입력하세요");
		String trip = JOptionPane.showInputDialog("여행지를 입력하세요");
		//처리
		String result = "당신은 " +trip +"로" + hobby + "를 즐기러 간다.";	
		
		//출력
		JOptionPane.showMessageDialog(null, 
				result); 

		
	}

}
