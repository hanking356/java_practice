package 클래스만들기;

public class 거실 {

	public static void main(String[] args) {
		//int x = 100;
		//타입 변수명 = 값;
		//클래스명은 변수의 타입으로 사용할 수 있다.
		//클래스명 변수명(객체의 이름) = new 클래스명();
		TV tv1 = new TV();
		TV tv2 = new TV();
		PUP pup1 = new PUP();
		PUP pup2 = new PUP();
		//tv1, tv2 객체의 멤버변수가 각자 저장되어야 한다.
		//tv1, tv2 객체의 멤버변수를 저장할 공간이 필요.
		//new할때, 멤버변수가 복사된다.
		tv1.color = "빨간색";//배열과 똑같음
		tv1.size = 50;
		
		
		tv2.color = "검정색";
		tv2.size = 42;
		
		System.out.println(tv1.color);
		System.out.println(tv2.size);
		System.out.println(tv1.color);
		System.out.println(tv2.size);
		tv1.on();
		tv2.off();
		
		tv2.ch();
		
		
		
		pup1.bark();
		pup2.bark();
		
	}

}
