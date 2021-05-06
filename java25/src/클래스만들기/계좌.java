package 클래스만들기;

public class 계좌 {
	public String name;
	public String sort;
	public int cost;
	
	public void in(String name, String sort, int cost) {
		System.out.println("이름은" + name);
		System.out.println("통장종류는" + sort);
		System.out.println("금액은" + cost);
		
	}
	public void in(String name, int cost) {
		System.out.println("이름은" + name);
		System.out.println("금액은" + cost);
		
	}
	public void out(int cost) {
		System.out.println("이름은" + name);
		System.out.println("금액은" + cost);
		
	}
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", sort=" + sort + ", cost=" + cost + "]";
	}
	
	
}
