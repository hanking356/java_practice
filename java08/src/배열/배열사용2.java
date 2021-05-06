package 배열;

import java.util.Iterator;

public class 배열사용2 {

	public static void main(String[] args) {
		// 내가 알고 있는 경우
		String[] name = { "홍길동", "박길동", "정길동", "이길동" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " ");
		}
		System.out.println();
		for (String s : name) {// for each
			System.out.println(s + " ");

		}
		// char 성별 넣고, 출력
		// boolean 아침 먹었냐고 넣고, 출력
		// double 시력넣고, 출력
		// int 나이 넣고, 출력
		char[] gender = { '남', '여', '남', '여' };
		for (char s : gender) {
			System.out.println(s + " ");
		}
		double[] eye = { 1.2, 1.5, 1.0, 0.8 };
		for (double i : eye) {
			System.out.print(i + " ");
		}
		System.out.println();
		boolean[] food = { true, false, true, false };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i] + "");
		} // 지역 변수
			// 이 지역안에서 만들어지는 변수는 지역밖에서는 인식 불가
			// 변수가 만들어지는 위치 지역안에서만 사용 가능!
			// 변수는 언제 만들어지는가? 타입 변수면;(선언)
			// System.out.println(test);
			// 1. 오타! 해당 변수가 존재하는지 확인
			// 2. 특정한 범위안에서 쓸 수 있는 지역변수가 아니니지
			// 3. 사용 하려고 하는 라인보다 아래에서 만들어진 것은 아닌지
			// test는 사용 불가 38라인에서는 아직 test가 만들어지지 않음

		int test = 100;
		for (boolean b : food) {
			System.out.println(b + "");
		}
		int[] age = { 100, 200, 300, 400 };
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		for (int i : age) {
			System.out.print(i + " ");
			System.out.println(test);
		}

		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + gender[i] + " " + food[i] + " " + eye[i] + " " + age[i]);
		}

	}//main
}//clss
