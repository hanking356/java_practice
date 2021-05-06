package 클래스연습;

import java.util.Date;

public class 계산기 {
	
	public int getHour() {
		Date date = new Date();
		int result = date.getHours();//12
		return result;
	}
	public int add(int x, int y) {
		//메서드안에서 선언된 변수는 메서드 안에서만 사용가능
		//메서드 범위 지역안에서만 사용가능
		//지역 변수, 로컬변수 <-->전역변수, 글로벌 변수
		int result = x + y;
		return result;
	}

	public int minus(int x, int y) {
		int result = x - y;
		return result;
		
	}
	
	public int mul(int x, int y) {
		int result = x * y;
		return result;//return은 맨 끝줄에!
	}

	public int div(int x, int y) {
		int result = x / y;
		return result;
	}

}
