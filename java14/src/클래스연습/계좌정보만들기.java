package 클래스연습;

public class 계좌정보만들기 {

	public static void main(String[] args) {
		Account a = new Account();
		Account b = new Account();

		a.name = "홍길동";
		a.accoun = "튼튼적금";
		a.cost = 1000;
		a.in(5000);

		b.name = "김길동";
		b.accoun = "다음 적금";
		b.cost = 3000;
		b.out(2000);

	}

}
