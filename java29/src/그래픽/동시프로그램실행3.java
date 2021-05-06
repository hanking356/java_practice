package 그래픽;

public class 동시프로그램실행3 {

	public static void main(String[] args) {
		날짜스레드 date = new 날짜스레드();
		image img = new image();
		count count = new count();
		
		date.start();
		img.start();
		count.start();
	}

}
