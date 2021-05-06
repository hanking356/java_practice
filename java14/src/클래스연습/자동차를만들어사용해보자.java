package 클래스연습;

public class 자동차를만들어사용해보자 {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.color = "빨간색";
		
		Car c2 = new Car();
		c2.color = "파랑색";
		
		//c1,c2는 참조형 변수로 주소가 들어있음
		//주소가 들어있는 변수가 있으면 메서드를 사용할 수 있다.
		
		c1.run();
		c2.up();

	}

}
