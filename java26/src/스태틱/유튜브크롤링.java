package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 유튜브크롤링 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://www.youtube.com/");
		//System.out.println(con);
		
		//2. 연결한 사이트에 html문서를 받아오세요.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("#video-title");
		System.out.println(anav.size());
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(i + ": " + anav.get(i).text());
		}
	}

}
