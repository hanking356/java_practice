package 생성자1;

public class 직원 {
	String name;
	String gender;
	int age;
	static int count;
	static int total;
	
	public 직원(String name, String gender, int age) {
		super();
		count ++;
		total = total + age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//static 메서드 안에서는 static 변수만 사용 가능
	//static 메서드는 객체 생성 없이 사용 가능하므로 클래스의 필요한 함수를 불러 올때는 static 메서드를 설정
	public static void getAvg() {
		System.out.println(total/(double)count);
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
