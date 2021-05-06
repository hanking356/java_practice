package 상속;

public class 슈퍼맨 extends 맨 {
	//멤버 변수 3, 멤버메서드 2
	
	boolean fly;
	
	public void 우주를날다() {
		System.out.println("이름이" + name + "슈퍼맨이 지구밖인 우주를 날다.");
	}

	@Override
	//상속받았던 메서즈 중에서 메서드의 기능을 재정의해서 사용할 수 있음
	//오버라이딩(매서드 재정의)
	public String toString() {
		return "슈퍼맨 [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
}
