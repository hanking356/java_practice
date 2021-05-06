package 크롤링;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 파일에저장2 {

	public static void main(String[] args) throws Exception {
		String[] code = {"episode", "omnibus",  "story"};  
		for (int i = 0; i < code.length; i++) {
			Connection con = Jsoup.connect("https://comic.naver.com/genre/bestChallenge.nhn?m=" + code[i]);
			//연결한 사이트에 html문서를 받아오세요.
			Document doc = con.get();
			Elements anav = doc.select("h6.challengeTitle");		
			try {		
				//해당 폴더와 스트림(연결)을 만든다.
				FileWriter f = new FileWriter("c:/data/" + code[i] + ".txt");
				//각 code당 크롤링 하기
				for (int j = 0; j < anav.size(); j++) {
					f.write(anav.get(j).text() + "\n");
				}
					f.close(); //스트림을 다 쓰고 나서는 반드시 자원해제!
			} catch (IOException e) {
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러정보는" + e.getMessage());
			}
		}
				
	}

}
