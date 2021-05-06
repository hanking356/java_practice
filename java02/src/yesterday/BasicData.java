package yesterday;

public class BasicData {

	public static void main(String[] args) {
		System.out.println("자바 두번째 날입니다.");
		//컨트롤 + s
		//컨트롤 +f11
		
		//기본데이터: 정수, 실수, 문자1, 논리
		//변수(저장공간), 변수명
		//자바에서의 저장공간 생성시기
		int num = 0;//들어갈 데이터 타입 변수명; tjsdjs!
		//선언을 할 대 자바는 변수가 할당, 4바이트(-21억~21억)
		
		double eye = 0.0; //8파이트
		
		char gender = '가';//2바이트
		
		boolean food = false;//1바이트

		//변수를 선언할 때는 처음값을 넣어주는 것이 좋다.
		//처음값=>초기값, 초기값을 넣어주는 것을 초기화!
		//변수는 초기화를 해야한다.
		System.out.println(num);
		String name = "홍길동";
				//사람이 너무 많이 데이터의 형태라서 기본형처럼 사용하게 만들어 놓음
	}

}
