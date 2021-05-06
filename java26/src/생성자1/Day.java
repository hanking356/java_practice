package 생성자1;

public class Day {
	//멤버변수는 객체 생성 될때 마다 동적으로 메모리가 할당
	//객체가 3개 생성되었다면, 객체마다 각각 다른 속성값들을 가져야 한다.
	//실제로 그 객체에 해당하는 실체값들이 구체적으로 저장되는 특징
	//실제값: instance(인스턴스)
	//객체 생성할 때마다 복사되는 변수:인스턴스 변수
	String work;
	int time;
	String location;
	
	//static 변수는 클래스당 한개만 가지고 있는 변수
	//클래스 이름.변수명 Day.count
	//객체 생성과는 상관이 없다.
	//Static은 객체 생성하지 않아도 가능
	static int count; //전역 변수. 0으로 초기화
	static int sum;
	
	public Day(String work, int time, String location) {
		super();
		count ++;
		sum = sum + time;
		this.work = work;
		this.time = time;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Day [work=" + work + ", time=" + time + ", location=" + location + "]";
	}
	
	
}
