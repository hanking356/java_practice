package Ŭ��������;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class �������α׷� {
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
				System.out.println("���ϱ� ��ư Ŭ����.");
				// t1, t2�� �Է��� ���� ������ �;� ��.
				String s1 = t1.getText();// �Է��� String �� t1�� s1�� ����
				String s2 = t2.getText();// �Է��� String �� t2�� s2�� ����
				System.out.println(s1);//s1���� ����Ʈ
				System.out.println(s2);//s2���� ����Ʈ
				
				//��ȯ���� �վ������ ������ ������� ���� �� ����.
				int i1 = Integer.parseInt(s1);//String ���� int�� ����
				int i2 = Integer.parseInt(s2);//String ���� int�� ����
				���� cal = new ����();//���� class�� �޼��带 �����ϱ� ���� ��ü ���� //���� Ŭ������ �޼��带 ���
				int x = cal.add(i1, i2); 
				t3.setText("���� ����" + x);

			}
		});
		btnNewButton.setBounds(12, 207, 97, 174);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uBE7C\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� ��ư Ŭ����");
				// t1, t2�� �Է��� ���� ������ �;� ��.
				String s1 = t1.getText();// "200"
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				//��ȯ���� �վ������ ������ ������� ���� �� ����.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				���� cal = new ����();
				
				int x = cal.minus(i1, i2); 
				t3.setText("�� ����" + x);
			}
		});
		btnNewButton_1.setBounds(121, 207, 97, 174);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uACF1\uD558\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ϱ� ��ư Ŭ����");
				String s1 = t1.getText();// "200"
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				//��ȯ���� �վ������ ������ ������� ���� �� ����.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				���� cal = new ����();
				int x = cal.mul(i1, i2); 
				//f.setTitle("���� ����" + x);
				t3.setText("���� ����" + x);
			}
		});
		btnNewButton_2.setBounds(230, 207, 97, 174);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\uB098\uB204\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ��ư Ŭ����");
				// t1, t2�� �Է��� ���� ������ �;� ��.
				String s1 = t1.getText();// "200"
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				//��ȯ���� �վ������ ������ ������� ���� �� ����.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				���� cal = new ����();
				int x = cal.div(i1, i2); 
				t3.setText("���� ����" + x);
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
