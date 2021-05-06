package 어제복습;

public class Phone사용 {

	public static void main(String[] args) {
		Phone p1 = new Phone("빨강",7);
//		p1.color = "빨강";
//		p1.size = 7;
		p1.text();
		System.out.println(p1);
		//Phone [color=" + color + ", size=" + size + "] ->p1에 들어가 있음
		Phone p2 = new Phone("파랑",5);
//		p2.color = "파랑";
//		p2.size = 5;
		p2.text();
		System.out.println(p2);
	}

}
