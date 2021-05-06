package 클래스연습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기프로그램 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC22B\uC7901");
		lblNewLabel.setBounds(47, 42, 62, 30);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902");
		lblNewLabel_1.setBounds(47, 96, 62, 30);
		f.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBounds(192, 36, 218, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(192, 90, 218, 44);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼 클릭됨.");
				// t1, t2에 입력한 값을 가지고 와야 함.
				String s1 = t1.getText();// 입력한 String 값 t1을 s1에 저장
				String s2 = t2.getText();// 입력한 String 값 t2를 s2에 저장
				System.out.println(s1);//s1값을 프린트
				System.out.println(s2);//s2값을 프린트
				
				//반환값이 잇어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);//String 값을 int로 저장
				int i2 = Integer.parseInt(s2);//String 값을 int로 저장
				계산기 cal = new 계산기();//계산기 class의 메서드를 생성하기 위해 객체 생성 //계산기 클래스의 메서드를 사용
				int x = cal.add(i1, i2); 
				t3.setText("더한 값은" + x);

			}
		});
		btnNewButton.setBounds(12, 207, 97, 174);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uBE7C\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼 클릭됨");
				// t1, t2에 입력한 값을 가지고 와야 함.
				String s1 = t1.getText();// "200"
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				//반환값이 잇어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				
				int x = cal.minus(i1, i2); 
				t3.setText("뺀 값은" + x);
			}
		});
		btnNewButton_1.setBounds(121, 207, 97, 174);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uACF1\uD558\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 버튼 클릭됨");
				String s1 = t1.getText();// "200"
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				//반환값이 잇어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int x = cal.mul(i1, i2); 
				//f.setTitle("곱한 값은" + x);
				t3.setText("곱한 값은" + x);
			}
		});
		btnNewButton_2.setBounds(230, 207, 97, 174);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\uB098\uB204\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 버튼 클릭됨");
				// t1, t2에 입력한 값을 가지고 와야 함.
				String s1 = t1.getText();// "200"
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				//반환값이 잇어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int x = cal.div(i1, i2); 
				t3.setText("나눈 값은" + x);
			}
		});
		btnNewButton_3.setBounds(342, 207, 97, 174);
		f.getContentPane().add(btnNewButton_3);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(121, 144, 218, 44);
		f.getContentPane().add(t3);
		f.setVisible(true);

	}
}
