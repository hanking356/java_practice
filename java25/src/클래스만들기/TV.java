package 클래스만들기;

public class TV {
	//멤버변수
	//선언:ram에 변수가 생성되는 것.
	//    선언의 위치가 변수를 사용 할 수 있는 범위를 결정
	//public 접근제어자를 써야 당른 패키지에서도 사용 가능
	public int ch;
	public int vol;
	public boolean onOFF;
	public void on() {
		System.out.println("tv를 켜다");
	}
	public void off() {
		System.out.println("tv를 끄다");
	}
	public void changeCH() {
		System.out.println("채널을 바꾸다.");
	}
	//기존에 기존에 있던 메서드를 덮어쓰고 싶으면, 기존에 있던 메서드를 똑같이 써주면 된다.
	
	//오버라이딩(재정의), override : 상속 받은 메서드 중에서 기능을 재정의해서 사용
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOFF=" + onOFF + "]";
	}
}
