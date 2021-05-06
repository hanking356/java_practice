package 문제풀이;

public class 직원 {
	String name;
	int age;
	int num;
	
	
	public 직원(String name, int age, int num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}


	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", num=" + num + "]";
	}
	
}
