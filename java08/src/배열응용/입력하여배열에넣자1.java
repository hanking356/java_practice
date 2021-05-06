package 배열응용;

import javax.swing.JOptionPane;

public class 입력하여배열에넣자1 {

	public static void main(String[] args) {
		String[] s = new String[3];

		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳");
		}

		String[] p = new String[3];

		for (int i = 0; i < p.length; i++) {
			p[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳");
		}
		int count = 0;
		for (int i = 0; i < p.length; i++) {
			if (s[i].equals(p[i])) {
				System.out.println("위치는" + i + "에 있음");
				System.out.println(s[i]);
				count++;
			}
		}
		System.out.println("같은 위치의 갯수는:" + count);
	}

}
