package 생성자1;

public class 계좌 {
	String name;
	String field;
	int money;
	//new 계좌()=>사용 불가, default 생성자를 만들지 않는 이상
	//생성자는 기본적으로 메서드구조, 호출은 객체 생성할 때
	public 계좌(String name, String field, int money) {

		this.name = name;
		this.field = field;
		this.money = money;
	}
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}
	
	
	
	
}
