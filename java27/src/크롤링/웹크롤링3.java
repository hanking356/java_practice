package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ��ũ�Ѹ�3 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://www.youtube.com/results?search_query=%EC%B6%95%EA%B5%AC");
		//System.out.println(con);
		
		//2. ������ ����Ʈ�� html������ �޾ƿ�����.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("a.video-title");
//		for (Element e : anav) {
//			System.out.println(e.text());
//		}
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(anav.get(i).text());
		}
		

	}

}
