package ��������;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;

	public void open(){
		  JFrame f = new JFrame("�ϱ⾲�� ȭ��");
	      f.getContentPane().setBackground(Color.GREEN);
	      f.getContentPane().setLayout(null);
	      
	      t1 = new JTextField();
	      t1.setBackground(Color.YELLOW);
	      t1.setForeground(Color.BLACK);
	      t1.setBounds(130, 41, 188, 37);
	      f.getContentPane().add(t1);
	      t1.setColumns(10);
	      
	      JTextArea textArea = new JTextArea();
	      
	      t2 = new JTextField();
	      t2.setBackground(Color.YELLOW);
	      t2.setColumns(10);
	      t2.setBounds(130, 114, 188, 37);
	      f.getContentPane().add(t2);
	      
	      JButton save = new JButton("\uD30C\uC77C\uC5D0 \uC77C\uAE30 \uC800\uC7A5");
	      save.setFont(new Font("����", Font.BOLD, 20));
	      save.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e2) {
	      		String s1 = t1.getText();
	      		String s2 = t2.getText();
	      		String s3 = textArea.getText();	      			      		
	      		try {		
	    			//�ش� ������ ��Ʈ��(����)�� �����.
	    			//��Ʈ���� Ư¡�� �� ����!!
	    			FileWriter file = new FileWriter("c:/data/" + s1+ ".txt");//��θ� ���� ���� �̸��� ����� ����
	    			//���� ���: ��ġ�� ��Ÿ���� �� �F�������� �� ���ִ� ���
	    			//�����: ���� ��ġ�� �����ؼ� ��������� ���ִ� ���
	    			file.write(s1 + "\n");
	    			file.write(s2 + "\n");
	    			file.write(s3 + "\n");
	    			file.close(); //��Ʈ���� �� ���� ������ �ݵ�� �ڿ�����!
	    			 JOptionPane.showMessageDialog(f, "���Ͽ� ���� ����");
	    		} catch (IOException e) {
	    		System.out.println("���Ϸ� ���� �� �����߻�");
	    		System.out.println("����������" + e.getMessage());
	    		}
	    	}
	      	
	      });
	      save.setBounds(50, 381, 257, 62);
	      f.getContentPane().add(save);
	      
	      JLabel lblNewLabel_1 = new JLabel("\uC624\uB298\uC758 \uC81C\uBAA9");
	      lblNewLabel_1.setFont(new Font("����", Font.BOLD, 18));
	      lblNewLabel_1.setBounds(14, 124, 102, 27);
	      f.getContentPane().add(lblNewLabel_1);
	      
	      JLabel lblNewLabel_1_1 = new JLabel("\uC624\uB298\uC758 \uB0B4\uC6A9");
	      lblNewLabel_1_1.setFont(new Font("����", Font.BOLD, 18));
	      lblNewLabel_1_1.setBounds(14, 240, 102, 27);
	      f.getContentPane().add(lblNewLabel_1_1);
	      
	      JLabel lblNewLabel = new JLabel("\uC624\uB298\uC758 \uB0A0\uC9DC");
	      lblNewLabel.setFont(new Font("����", Font.BOLD, 18));
	      lblNewLabel.setBounds(14, 41, 102, 37);
	      f.getContentPane().add(lblNewLabel);
	      
	    
	      textArea.setColumns(10);
	      textArea.setBackground(Color.YELLOW);
	      textArea.setRows(5);
	      textArea.setBounds(130, 193, 175, 147);
	      f.getContentPane().add(textArea);
	      f.setSize(350, 500);
	      
	      
	      
	      f.setVisible(true);

	}
}
