package 생성자1;

public class 은행 {

	public static void main(String[] args) {
		계좌 account = new 계좌("홍길동","튼튼적금",1000 );
		계좌 account1 = new 계좌("홍길동","튼튼적금",1000 );
		계좌 account2 = new 계좌("홍길동","튼튼적금",1000 );
		System.out.println(account);
		System.out.println(account1);
		System.out.println(account2);
	}

}
