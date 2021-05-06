package 생성자1;

public class TV {
	int ch;
	int vol;
	boolean onOFF;
	
	//다른 생성자가 하나도 없으면 자동으로 만들어진다.
	//묵시적으로 기본생성자가 정의
	//파라메터 없는 생성자, 기본 생성자(defult 생성자)
	//기본 생성자는 다른 생성자가 하나도 없으면 자동으로 만들어 진다.
	//일단 객체생성한 후 멤버변수값을 나중에 넣어주는 경우
	//마라메터 있는 경우를 함께 사용하고자 하는 경우
	//명시적으로 기본생성자를 정의해주어야한다.
	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//셍상자, 파라메터있는 생성자
	public TV(int ch, int vol, boolean onOFF) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.onOFF = onOFF;
	}
	
	

	public void on() {
		System.out.println("켜다");
	}
	public void off() {
		System.out.println("끄다");
	}
	
}
