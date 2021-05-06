package 파일저장;

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
		  JFrame f = new JFrame("일기쓰는 화면");
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
	      save.setFont(new Font("굴림", Font.BOLD, 20));
	      save.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e2) {
	      		String s1 = t1.getText();
	      		String s2 = t2.getText();
	      		String s3 = textArea.getText();	      			      		
	      		try {		
	    			//해당 폴더와 스트림(연결)을 만든다.
	    			//스트림의 특징은 한 방향!!
	    			FileWriter file = new FileWriter("c:/data/" + s1+ ".txt");//경로를 통해 파일 이름을 만들어 저장
	    			//절대 경로: 위치를 나타낼때 맨 낲에서부터 쭉 써주는 경로
	    			//상대경로: 현재 위치를 기준해서 상대적으로 써주는 경로
	    			file.write(s1 + "\n");
	    			file.write(s2 + "\n");
	    			file.write(s3 + "\n");
	    			file.close(); //스트림을 다 쓰고 나서는 반드시 자원해제!
	    			 JOptionPane.showMessageDialog(f, "파일에 저장 성공");
	    		} catch (IOException e) {
	    		System.out.println("파일로 저장 중 에러발생");
	    		System.out.println("에러정보는" + e.getMessage());
	    		}
	    	}
	      	
	      });
	      save.setBounds(50, 381, 257, 62);
	      f.getContentPane().add(save);
	      
	      JLabel lblNewLabel_1 = new JLabel("\uC624\uB298\uC758 \uC81C\uBAA9");
	      lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
	      lblNewLabel_1.setBounds(14, 124, 102, 27);
	      f.getContentPane().add(lblNewLabel_1);
	      
	      JLabel lblNewLabel_1_1 = new JLabel("\uC624\uB298\uC758 \uB0B4\uC6A9");
	      lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 18));
	      lblNewLabel_1_1.setBounds(14, 240, 102, 27);
	      f.getContentPane().add(lblNewLabel_1_1);
	      
	      JLabel lblNewLabel = new JLabel("\uC624\uB298\uC758 \uB0A0\uC9DC");
	      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
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
