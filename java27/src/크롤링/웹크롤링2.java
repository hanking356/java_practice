package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ��ũ�Ѹ�2 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://overwatch.op.gg/heroes/global");
		//System.out.println(con);
		
		//2. ������ ����Ʈ�� html������ �޾ƿ�����.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("table.HeroesRank span.Value");
//		for (Element e : anav) {
//			System.out.println(e.text());
//		}
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(anav.get(i).text());
		}
	}

}
