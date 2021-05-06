package 클래스사용하기;

import 클래스만들기.PUP;

public class 마당 {

	public static void main(String[] args) {
		//pup1, pup2애눈 주소가 들어가 있음
		PUP pup1 = new PUP();
		//pup1, color, type이 만들어 짐
		//pup1 안에 color, type을 가르키고 있는 주소가 저장됨
		PUP pup2 = new PUP();
		//pup2, color, type이  만들어 짐
		
		
		pup1.color = "갈색";
		//pup1의 주소가 가르키는 color 변수에 "갈색"을 저장한다.
		//public으로 선언하지 않으면 다른패키지에서는 not visible
		pup1.type = "진돗개";
		pup1.bark();
		
		
	}

}
