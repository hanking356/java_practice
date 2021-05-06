package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���Ͽ�����2 {

	public static void main(String[] args) throws Exception {
		String[] code = {"episode", "omnibus",  "story"};  
		for (int i = 0; i < code.length; i++) {
			Connection con = Jsoup.connect("https://comic.naver.com/genre/bestChallenge.nhn?m=" + code[i]);
			//������ ����Ʈ�� html������ �޾ƿ�����.
			Document doc = con.get();
			Elements anav = doc.select("h6.challengeTitle");		
			try {		
				//�ش� ������ ��Ʈ��(����)�� �����.
				FileWriter f = new FileWriter("c:/data/" + code[i] + ".txt");
				//�� code�� ũ�Ѹ� �ϱ�
				for (int j = 0; j < anav.size(); j++) {
					f.write(anav.get(j).text() + "\n");
				}
					f.close(); //��Ʈ���� �� ���� ������ �ݵ�� �ڿ�����!
			} catch (IOException e) {
			System.out.println("���Ϸ� ���� �� �����߻�");
			System.out.println("����������" + e.getMessage());
			}
		}
				
	}

}
