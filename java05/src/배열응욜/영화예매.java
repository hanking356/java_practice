package 배열응욜;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 750);
		// 물 흐르듯이 순서대로 배치를 해주는 부품 필요
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		int[] seat = new int[200];// {0,0,0,0,0...args.}

		for (int i = 0; i < 200; i++) {

			JButton b = new JButton();
			b.setText(i + "");
			f.add(b);
			b.setBackground(Color.yellow);
			
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("버튼을 눌렀군요.");
					b.setBackground(Color.red);
					System.out.println("좌석번호는" + b.getText());//"100"
					// 좌석번호가 seat배열의 index역할! => int
					int index = Integer.parseInt(b.getText());//100
					// 배열의 각 index의 값 0인 경우: 예매가 안된 상황이라고 가정
					// 배열의 각 index의 값 1로 변경한 경우: 예매가 된 상황이라고 가정

					seat[index] = 1;// seat[100] = 1;
					b.setEnabled(false);// 클릭기능을 막음.
				}

			});

			f.setVisible(true);

		}

	}
}

