package 상속;

public class Manager extends Employee {
	//private은 자기 class에서만 사용 가능하고 외부 class에서는 수정, 사용등 접근이 불가능
	private int bonus = 100;
	
	public void test() {
		System.out.println(bonus + "만원 보너스 받으며 감독하다");
	}
}
