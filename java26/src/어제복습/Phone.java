package 어제복습;

public class Phone {
	String color;
	int size;
	
	public Phone(String color, int size) {
		//this라는 의미는 해당 클래스를 의미
		//this.color: 해당 클래스 바로 밑의 선언된 color라는 의미
		//this로 전역변수를 지정할 수 있다.
		//변수명이 전역/지역이 동일할 때 전역변수를 지정할 목적으로 사용
		this.color = color;
		this.size = size;
	}
	
	
	public void internet() {
		System.out.println("인터넷하다.");
	}
	public void text() {
		System.out.println("문자하다.");
	}
	@Override//원래는 부모가 toString을 만들어 놓았음
	public String toString() {
		return "Phone [color=" + color + ", size=" + size + "]";
	}
	
}
