package 클래스연습;

public class Account {
	
	String name;
	String accoun;
	int cost;
	//자바에서 변수는 
	//타입 변수명;(선언)
	//선언할때 변수가 만들어진다.
	//선언의 변수가 사용 할 수 있는 범위
	//클래스 아래에서 선언됨
	//클래스 전역에서 사용 가능
	//전역변수, 글로벌 변수
	//전역변수는 자동 초기화됨
	
	public void in(int x) {
		System.out.println(cost + x + "원");
	}
	
	public void out(int x) {
		System.out.println(cost + x + "원");
	}
}
