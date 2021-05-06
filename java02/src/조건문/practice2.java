package 조건문;

import javax.swing.JOptionPane;

public class practice2 {

	public static void main(String[] args) {
		int 점수 = 75;
		char 등급 = ' ';

		if (점수 >= 90) {
			등급 = 'A';
		} else if (점수 >= 80) {
			등급 = 'B';
		} else if (점수 >= 70) {
			등급 = 'C';
		} else
			등급 = 'D';
		JOptionPane.showMessageDialog(null, 등급);
	}
}
