package 클래스연습;

public class Phone {
	String Color;
	String Shape;
	
	public void Call() {
		System.out.println("전화를 받습니다.");
	}
	public void Text(String x, String y, int z) {
		//x, y, z가 파라메터, 매개변수
		//개수, 타입, 순서 다 맞추어야 함
		System.out.println(x + "에게" + y +"라고" + z + "시에 전화기로 문자하다.");
		System.out.println("문자를 보냅니다.");
	}
	public void internet(String x, int y) {
		System.out.println(x + "를 어제" + y +"시간 서핑했다.");
	}

}
