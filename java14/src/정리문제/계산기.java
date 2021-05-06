package 정리문제;

import java.util.Date;

public class 계산기 {
	//return은 맨 끝줄에!
	public int getHour() {
		Date date = new Date();//Date 클래스를 활용해 객체 생성
		int result = date.getHours();//Date클래스의 시간을 뽑아오는 메서드를 활용해 현재 시간값을 result에 저장
		return result;//result값을 int로 반환함
	}
	public int add(int x, int y) {
		//메서드안에서 선언된 변수는 메서드 안에서만 사용가능
		//메서드 범위 지역안에서만 사용가능
		//지역 변수, 로컬변수 <-->전역변수, 글로벌 변수
		int result = x + y;//x + y의 값을 int result에 저장함
		return result;//result값을 int값으로 반환함
	}

	public int minus(int x, int y) {
		int result = x - y;//x - y의 값을 int result에 저장함
		return result;//result값을 int값으로 반환함
		
	}
	
	public int mul(int x, int y) {
		int result = x * y;//x * y의 값을 int result에 저장함
		return result;//result값을 int값으로 반환함
	}

	public double div(double x, int y) {
		double result = x / y;//x / y의 값을 int result에 저장함
		return result;//result값을 int값으로 반환함
	}

}
