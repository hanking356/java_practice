package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 gj = new 계좌();
		gj.name = "홍길동";
		gj.sort = "적음";
		gj.cost = 100;
		System.out.println(gj);
		
	gj.in("홍길동", 1000);
	gj.in("장길산", "튼튼", 1);
	gj.out(2);
		
	}

}
