package ��������;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ����׷��� {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC22B\uC7901");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 25));
		lblNewLabel.setBounds(38, 31, 80, 28);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(38, 108, 80, 28);
		f.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBackground(Color.ORANGE);
		t1.setBounds(154, 26, 192, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBackground(Color.ORANGE);
		t2.setColumns(10);
		t2.setBounds(154, 103, 192, 47);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int s1 = Integer.parseInt(t1.getText());// �Է¹��� String �� t1�� int�� �� ��ȯ �� s1�� ����
				int s2 = Integer.parseInt(t2.getText());// �Է¹��� String �� t2�� int�� �� ��ȯ �� s2�� ����

				���� a = new ����();// ���� class�� �޼��带 ����ϱ� ���� ��ü ����
				int x = a.add(s1, s2);// ���ϱ� �޼��带 ����� ��ȯ�� ���� int x�� ����
				System.out.println("���� ����" + x);
				t3.setText("���� ����" + x);// ���ϱ� ����� ���� t3â�� ���

			}
		});
		btnNewButton.setBounds(17, 237, 73, 114);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uBE7C\uAE30");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(t1.getText());// �Է¹��� String �� t1�� int�� �� ��ȯ �� s1�� ����
				int s2 = Integer.parseInt(t2.getText());// �Է¹��� String �� t1�� int�� �� ��ȯ �� s1�� ����

				���� a = new ����();// ���� class�� �޼��带 ����ϱ� ���� ��ü ����
				int x = a.minus(s1, s2);// ���� �޼��带 ����� ��ȯ�� ���� int x�� ����
				System.out.println("�� ����" + x);
				t3.setText("�� ����" + x);// ������ ����� ���� t3â�� ���

			}
		});
		btnNewButton_1.setBounds(102, 237, 73, 114);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("\uACF1\uD558\uAE30");
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(t1.getText());// �Է¹��� String �� t1�� int�� �� ��ȯ �� s1�� ����
				int s2 = Integer.parseInt(t2.getText());// �Է¹��� String �� t1�� int�� �� ��ȯ �� s1�� ����

				���� a = new ����();// ���� class�� �޼��带 ����ϱ� ���� ��ü ����
				int x = a.mul(s1, s2);// ���ϱ� �޼��带 ����� ��ȯ�� ���� int x�� ����
				System.out.println("���� ����" + x);
				t3.setText("���� ����" + x);// ���ϱ��� ����� ���� t3â�� ���

			}
		});
		btnNewButton_1_1.setBounds(198, 237, 73, 114);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("\uB098\uB204\uAE30");
		btnNewButton_1_2.setBackground(new Color(240, 230, 140));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(t1.getText());// �Է¹��� String �� t1�� int�� �� ��ȯ �� s1�� ����
				int s2 = Integer.parseInt(t2.getText());// �Է¹��� String �� t1�� int�� �� ��ȯ �� s1�� ����

				���� a = new ����();// ���� class�� �޼��带 ����ϱ� ���� ��ü ����
				double x = a.div(s1, s2);// ������ �޼��带 ����� ��ȯ�� ���� int x�� ����
				System.out.println("���� ����" + x);
				t3.setText("���� ����" + x);// �������� ����� ���� t3â�� ���

			}
		});
		btnNewButton_1_2.setBounds(283, 237, 73, 114);
		f.getContentPane().add(btnNewButton_1_2);

		t3 = new JTextField();
		t3.setBackground(new Color(238, 232, 170));
		t3.setBounds(71, 171, 233, 47);
		f.getContentPane().add(t3);
		t3.setColumns(10);

		f.setVisible(true);

	}

}
