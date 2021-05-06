package ũ�Ѹ�;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ����ũ�Ѹ� {

	public static void main(String[] args) {
		JFrame f = new JFrame("�α��� �ϴ� ȭ��");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uC634\uB2C8\uBC84\uC2A4");
		btnNewButton.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				String[] code = {"omnibus",  "story", "episode"};  				
						try {		
						Connection con = Jsoup.connect("https://comic.naver.com/genre/bestChallenge.nhn?m=" + code[0]);
						//������ ����Ʈ�� html������ �޾ƿ�����.
						Document doc = con.get();
						Elements anav = doc.select("h6.challengeTitle");		
						//�ش� ������ ��Ʈ��(����)�� �����.
						FileWriter f = new FileWriter("c:/data/" + code[0] + ".txt");
						//�� code�� ũ�Ѹ� �ϱ�
						for (int j = 0; j < anav.size(); j++) {
							f.write(anav.get(j).text() + "\n");
						}
							f.close(); //��Ʈ���� �� ���� ������ �ݵ�� �ڿ�����!
					} catch (IOException e2) {
					System.out.println("���Ϸ� ���� �� �����߻�");
					System.out.println("����������" + e2.getMessage());
					}
				}
			}
		);
		btnNewButton.setBounds(92, 77, 132, 38);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC2A4\uD1A0\uB9AC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] code = {"omnibus",  "story", "episode"};  				
				try {		
				Connection con = Jsoup.connect("https://comic.naver.com/genre/bestChallenge.nhn?m=" + code[1]);
				//������ ����Ʈ�� html������ �޾ƿ�����.
				Document doc = con.get();
				Elements anav = doc.select("h6.challengeTitle");		
				//�ش� ������ ��Ʈ��(����)�� �����.
				FileWriter f = new FileWriter("c:/data/" + code[1] + ".txt");
				//�� code�� ũ�Ѹ� �ϱ�
				for (int j = 0; j < anav.size(); j++) {
					f.write(anav.get(j).text() + "\n");
				}
					f.close(); //��Ʈ���� �� ���� ������ �ݵ�� �ڿ�����!
			} catch (IOException e2) {
			System.out.println("���Ϸ� ���� �� �����߻�");
			System.out.println("����������" + e2.getMessage());
			}
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(92, 166, 132, 38);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC5D0\uD53C\uC18C\uB4DC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] code = {"omnibus",  "story", "episode"};  				
				try {		
				Connection con = Jsoup.connect("https://comic.naver.com/genre/bestChallenge.nhn?m=" + code[2]);
				//������ ����Ʈ�� html������ �޾ƿ�����.
				Document doc = con.get();
				Elements anav = doc.select("h6.challengeTitle");		
				//�ش� ������ ��Ʈ��(����)�� �����.
				FileWriter f = new FileWriter("c:/data/" + code[2] + ".txt");
				//�� code�� ũ�Ѹ� �ϱ�
				for (int j = 0; j < anav.size(); j++) {
					f.write(anav.get(j).text() + "\n");
				}
					f.close(); //��Ʈ���� �� ���� ������ �ݵ�� �ڿ�����!
			} catch (IOException e2) {
			System.out.println("���Ϸ� ���� �� �����߻�");
			System.out.println("����������" + e2.getMessage());
			}
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(92, 260, 132, 38);
		f.getContentPane().add(btnNewButton_2);
		 
		 f.setVisible(true);
	}
}
