package 조건문;

import javax.swing.JOptionPane;

public class practice {

	public static void main(String[] args) {
		// 구매 항목:과자/라면/커피
		// 당신은 vip입니까? yes/no

		// 과자라면 어린아이군요!
		// 라면이면 성인이군요!
		// 그것도 아니라면 뭔가를 샀군요!

		// vip이면, 구매금액에서 1000원을 할인하여 결제 아니면, 구매금액 모두 결제

		String buy = JOptionPane.showInputDialog("구매 항목");//buy 변수에 입력값을 받음
		String vip = JOptionPane.showInputDialog("당신은 vip입니까?");//vip 변수에 입력값을 받음
		int money = 5000; //정수 money에 5000을가진 변수를 생성 

		String result = ""; //
		if (buy.equals("과자")) {
			result = "어린아이군요";
		} else if (buy.equals("과자")) {
			result = "성인이군요!";
		} else {
			result = "뭔가를 샀군요!";
		}

		
		if (vip.equals("yes")) {
			money = money - 1000;
		} else {
			
		}
		JOptionPane.showMessageDialog(null, result + money + "원");	
	}
}