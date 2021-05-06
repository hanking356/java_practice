package 클래스연습;

public class 전화를사용해보자 {

	public static void main(String[] args) {
		Phone p = new Phone();
		//p: 참조형 변수
		//size, color: 멤버변수가 복사됨
		
		p.Color = "black";
		p.Shape = "round";
		
		p.Call();
		p.Text("철수", "굿모닝", 10);
		p.Text("길동", "굿에프터눈", 15);
		p.internet("네이버", 10);
	}

}
