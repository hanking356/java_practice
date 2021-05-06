package 상속;

public class 영화에출연 extends 슈퍼맨 {

	public static void main(String[] args) {
		슈퍼맨 sMan = new 슈퍼맨();
		sMan.name = "클라크";
		sMan.age = 30000;
		sMan.speed = 1000;
		sMan.fly = true;
		
		sMan.먹다();
		sMan.달리다();
		sMan.우주를날다();
		System.out.println(sMan);
	}

}
