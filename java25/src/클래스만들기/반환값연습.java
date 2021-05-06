package 클래스만들기;

import java.util.Date;

public class 반환값연습 {
	public void add2() {
		System.out.println("더하기 기능을 수행하겠습니다.");
	}
	public int add(int x, int y) {//double
		return x + y;
	}
	public double add(double x, int y) {//하나라도 double이면 무조건 double
		return x + y;
	}
	public String add(String x, String y) {
		return x + y;
	}
	public String add(int x, String y) {
		return x + y;
	}
	public int[] add() {
		int [] x = {1,2,3};
		return x;
	}
	public Date getDate() {
		Date date = new Date();
		return date;
	}
}
