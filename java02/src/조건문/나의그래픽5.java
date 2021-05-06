package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽5 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uBA39\uACE0 \uC2F6\uC740 \uC74C\uC2DD");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(22, 22, 200, 55);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setBackground(Color.GRAY);
		t1.setBounds(266, 18, 263, 60);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();// t1창에 입력한 String을 s1에 저장한다.
				String result = "";// 출력할 새로운 변수 선언
				if (s1.equals("짬뽕")) {
					result = "중국집으로";// "짬뽕"을 입력했을 때 result에 "중국집"으로 저장
				} else if (s1.equals("우동")) {
					result = "일식집으로";// "우동"을 입력했을 때 result에 "일식집"으로 저장
				} else if (s1.equals("라면")) {
					result = "분식집으로";// "라면"을 입력했을 때 result에 "분식집"으로 저장
				} else {
					result = "집으로";// 위의 값을 지정 받지 않을 때 "집으로"으로 저장
				}
				// 출력해주는 부분
				JOptionPane.showMessageDialog(f, result);// 실행창에 result값을 띄우기
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton.setBounds(50, 95, 431, 55);
		f.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(22, 172, 200, 55);
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBackground(Color.PINK);
		t2.setBounds(266, 168, 263, 60);
		f.getContentPane().add(t2);

		JButton btnNewButton_1 = new JButton("\uB098\uC758 \uB0B4\uB144\uB098\uC774\uB294?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();// t2창에 입력한 String을 s2에 저장한다.
				int n2 = Integer.parseInt(s2);// 입력받은 s2는 String으로 저장 되기 때문에 연산을 위해 정수로 바꿔 n2에 저장한다.
				JOptionPane.showMessageDialog(f, "내년 나이는:" + (n2 + 1) + "살");// 실행창에 내년 나이값을 연산 후 띄우기
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton_1.setBounds(50, 245, 431, 55);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(22, 336, 200, 55);
		f.getContentPane().add(lblNewLabel_2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBackground(Color.CYAN);
		t3.setBounds(266, 332, 263, 60);
		f.getContentPane().add(t3);

		JButton btnNewButton_2 = new JButton("\uB450\uACFC\uBAA9 \uC810\uC218\uC758 \uD3C9\uADE0\uC740?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();// t3창에 입력한 String을 s3에 저장한다.
				int n3 = Integer.parseInt(s3);// 입력받은 s3는 String으로 저장 되기 때문에 연산을 위해 정수로 바꿔 n3에 저장한다.
				String s4 = t4.getText();// t4창에 입력한 String을 s4에 저장한다.
				int n4 = Integer.parseInt(s4);// 입력받은 s4는 String으로 저장 되기 때문에 연산을 위해 정수로 바꿔 n4에 저장한다.
				JOptionPane.showMessageDialog(f, "두 과목의 평균은: " + (n3 + n4) / 2 + "점");// 실행창에 두 과목의 평균을 연산 후 실행창에 띄운다.
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton_2.setBounds(50, 484, 431, 55);
		f.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel_2_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(22, 418, 200, 55);
		f.getContentPane().add(lblNewLabel_2_1);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBackground(Color.CYAN);
		t4.setBounds(266, 414, 263, 60);
		f.getContentPane().add(t4);
		f.setVisible(true);

	}
}
