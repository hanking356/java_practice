package ���ǹ�;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ���Ǳ׷���2 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLUE);
		f.getContentPane().setForeground(Color.BLUE);
		f.setSize(600, 800);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.PLAIN, 40));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();//"ȫ�浿"
				JOptionPane.showMessageDialog(f, "��ư�� ����̱���" + s1);
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);
	}

}
