package 크롤링;

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

public class 웹툰크롤링 {

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 하는 화면");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uC634\uB2C8\uBC84\uC2A4");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				String[] code = {"omnibus",  "story", "episode"};  				
						try {		
						Connection con = Jsoup.connect("https://comic.naver.com/genre/bestChallenge.nhn?m=" + code[0]);
						//연결한 사이트에 html문서를 받아오세요.
						Document doc = con.get();
						Elements anav = doc.select("h6.challengeTitle");		
						//해당 폴더와 스트림(연결)을 만든다.
						FileWriter f = new FileWriter("c:/data/" + code[0] + ".txt");
						//각 code당 크롤링 하기
						for (int j = 0; j < anav.size(); j++) {
							f.write(anav.get(j).text() + "\n");
						}
							f.close(); //스트림을 다 쓰고 나서는 반드시 자원해제!
					} catch (IOException e2) {
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러정보는" + e2.getMessage());
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
				//연결한 사이트에 html문서를 받아오세요.
				Document doc = con.get();
				Elements anav = doc.select("h6.challengeTitle");		
				//해당 폴더와 스트림(연결)을 만든다.
				FileWriter f = new FileWriter("c:/data/" + code[1] + ".txt");
				//각 code당 크롤링 하기
				for (int j = 0; j < anav.size(); j++) {
					f.write(anav.get(j).text() + "\n");
				}
					f.close(); //스트림을 다 쓰고 나서는 반드시 자원해제!
			} catch (IOException e2) {
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러정보는" + e2.getMessage());
			}
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(92, 166, 132, 38);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC5D0\uD53C\uC18C\uB4DC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] code = {"omnibus",  "story", "episode"};  				
				try {		
				Connection con = Jsoup.connect("https://comic.naver.com/genre/bestChallenge.nhn?m=" + code[2]);
				//연결한 사이트에 html문서를 받아오세요.
				Document doc = con.get();
				Elements anav = doc.select("h6.challengeTitle");		
				//해당 폴더와 스트림(연결)을 만든다.
				FileWriter f = new FileWriter("c:/data/" + code[2] + ".txt");
				//각 code당 크롤링 하기
				for (int j = 0; j < anav.size(); j++) {
					f.write(anav.get(j).text() + "\n");
				}
					f.close(); //스트림을 다 쓰고 나서는 반드시 자원해제!
			} catch (IOException e2) {
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러정보는" + e2.getMessage());
			}
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(92, 260, 132, 38);
		f.getContentPane().add(btnNewButton_2);
		 
		 f.setVisible(true);
	}
}
