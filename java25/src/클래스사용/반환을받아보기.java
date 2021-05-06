package 클래스사용;

import java.sql.Driver;
import java.util.Date;

import 클래스만들기.반환값연습;

public class 반환을받아보기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2();
		//void인 메서드를 호출하는 경우에는 변수에 그 결과값을 넣을 수 없음
		//프린트도 안된다.
		
		//메서드를 호출ㄹ하고 나서 반환값이 있을때만.
		//String rest = re.add2();
		//System.out.println(re.add2());
		
		System.out.println(re.add(200, 100));
		System.out.println(re.add(33.3, 50));
		System.out.println(re.add("다음시간은", "점심시간"));
		System.out.println(re.add(100, "은 나의 백넘버"));
		int[] sum = re.add();
		for (int x : sum) {
			System.out.println(x);
			
		}
		//String s;//일반클래스는 변수로의 타입으로 사용 가능
//		Date name = new Date(); //이렇게 하면 안됨 이미 객체 생성된채로 받은거임
		Date d = re.getDate();
		System.out.println(d);
		
		
		
	}

}
