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

public class ���Ǳ׷���4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.PLAIN, 40));
		t1.setBounds(224, 40, 305, 77);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("����", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBounds(224, 144, 305, 77);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.�Է��� t1, t2���� ������ �;��Ѵ�.
				//�ܺο��� �Է��� �������� Ÿ���� ��� String!!
				String s1 = t1.getText();//"200"
				String s2 = t2.getText();//"100"
				System.out.println(s1 + s2);
				//�ڹٿ����� + �����ڸ� ����� �� �ϳ��� String�̸� ������ �ǹ�!
				//String ->int�� �ٲ������.
				//��ǰ              �⺻�� ���� cpu�� �ϴ� ĳ������ �Ұ���!
				//�ٲپ��ִ� ��ǰ�� ����Ѵ�.
				int n1 = Integer.parseInt(s1); //"200"->200
				int n2 = Integer.parseInt(s2);
				System.out.println(n1 + n2);
				}
				//3.����� ���!
				
			
			
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 40));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(51, 269, 395, 136);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901:");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel.setBounds(40, 49, 156, 67);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902:");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(40, 153, 156, 67);
		f.getContentPane().add(lblNewLabel_1);
		f.setSize(600,600);
		f.setVisible(true);

	}
}
