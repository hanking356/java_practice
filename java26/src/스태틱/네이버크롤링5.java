package 스태틱;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링5 {

	public static void main(String[] args) throws Exception  {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=007570");
		//System.out.println(con);
		
		//2. 연결한 사이트에 html문서를 받아오세요.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("div.rate_info");
		System.out.println(anav.size());
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(i + ": " + anav.get(i).text());
		}

		String[] a = anav.get(0).text().split(" ");
		
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		//#owl > div > div > div:nth-child(1) > a > div > strong
//		Elements imgs = doc.getElementsByTag("img");
//		if(imgs.size() > 0) {
//		    String src = imgs.get(0).attr("src");
//		    System.out.println(src);
//		}

		//String[] all2 = all.split(",");
		
		
		
		
		
		
	}

}
