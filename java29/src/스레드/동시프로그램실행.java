package 스레드;

public class 동시프로그램실행 {

	public static void main(String[] args) {
		동시프로그램 t1 = new 동시프로그램();
		동시프로그램2 t2 = new 동시프로그램2();
		동시프로그램3 t3 = new 동시프로그램3();
		t1.start();
		t2.start();
		t3.start();
	}

}
