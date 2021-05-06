package 클래스만들기;

public class MemberDAO {
	//전역변수, 자동초기화
	//참조형 변수는 무조건 null로 초기화!
	//url: 멤버변수, 전역변수, 참조형변수
	String url = "jdbc:mysql://localhost:3306/shop";
	String id = "root";
	String pw = "1234";
	
	//자바는 메서드 이름을 똑같이 쓸수 있음
	//메서드의 구분은 입력값에 따라서 하기 때문!
	//하나의 이름으로 여러가지 형태의 메서드를 정의하여 호출할 수 있는 기능
	//메서드 오버로딩(다형성, 폴리모피즘) (메서드 오버로딩),(입력값이 다르다면 메서드 이름을 동일하게 사용할수 있다.)
	public void create(String id, String pw, String name) {
		System.out.println("당신이 입력한 id는 "+id);
		System.out.println("당신이 입력한 pw는 "+pw);
		System.out.println("당신이 입력한 name는 "+name);
	}
	public void create(String id, String pw, String name, String tel) {
		System.out.println("당신이 입력한 id는 "+id);
		System.out.println("당신이 입력한 pw는 "+pw);
		System.out.println("당신이 입력한 name는 "+name);
		System.out.println("당신이 입력한 name는 "+tel);
		
	}
	@Override
	public String toString() {
		return "MemberDAO [url=" + url + ", id=" + id + ", pw=" + pw + "]";
	}
	public void delete(String id) {
	System.out.println("당신이 입력한 id는 " + id);
		
	}
}