package ���ǹ�;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���5 {
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
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
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
				String s1 = t1.getText();// t1â�� �Է��� String�� s1�� �����Ѵ�.
				String result = "";// ����� ���ο� ���� ����
				if (s1.equals("«��")) {
					result = "�߱�������";// "«��"�� �Է����� �� result�� "�߱���"���� ����
				} else if (s1.equals("�쵿")) {
					result = "�Ͻ�������";// "�쵿"�� �Է����� �� result�� "�Ͻ���"���� ����
				} else if (s1.equals("���")) {
					result = "�н�������";// "���"�� �Է����� �� result�� "�н���"���� ����
				} else {
					result = "������";// ���� ���� ���� ���� ���� �� "������"���� ����
				}
				// ������ִ� �κ�
				JOptionPane.showMessageDialog(f, result);// ����â�� result���� ����
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 40));
		btnNewButton.setBounds(50, 95, 431, 55);
		f.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 30));
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
				String s2 = t2.getText();// t2â�� �Է��� String�� s2�� �����Ѵ�.
				int n2 = Integer.parseInt(s2);// �Է¹��� s2�� String���� ���� �Ǳ� ������ ������ ���� ������ �ٲ� n2�� �����Ѵ�.
				JOptionPane.showMessageDialog(f, "���� ���̴�:" + (n2 + 1) + "��");// ����â�� ���� ���̰��� ���� �� ����
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 40));
		btnNewButton_1.setBounds(50, 245, 431, 55);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 30));
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
				String s3 = t3.getText();// t3â�� �Է��� String�� s3�� �����Ѵ�.
				int n3 = Integer.parseInt(s3);// �Է¹��� s3�� String���� ���� �Ǳ� ������ ������ ���� ������ �ٲ� n3�� �����Ѵ�.
				String s4 = t4.getText();// t4â�� �Է��� String�� s4�� �����Ѵ�.
				int n4 = Integer.parseInt(s4);// �Է¹��� s4�� String���� ���� �Ǳ� ������ ������ ���� ������ �ٲ� n4�� �����Ѵ�.
				JOptionPane.showMessageDialog(f, "�� ������ �����: " + (n3 + n4) / 2 + "��");// ����â�� �� ������ ����� ���� �� ����â�� ����.
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 40));
		btnNewButton_2.setBounds(50, 484, 431, 55);
		f.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel_2_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_2_1.setFont(new Font("����", Font.PLAIN, 30));
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
