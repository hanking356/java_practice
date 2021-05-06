package 배열심화;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";

		// 1. String[]로 바꾸어보세요.
		String[] all2 = all.split(",");//{"국어"," 영어"," 수학"," 컴퓨터"}
		// 2. 바꾸었더니 공백이 포함되어 있다면, 공백을 모두 제거 후, 다시 배열에 넣으세요.
		for (int i = 0; i < all2.length; i++) {
			System.out.println(all2[i]);
		}
		for (int i = 0; i < all2.length; i++) {
			all2[i] = all2[i].trim();
		}

		// 3. 과목수는?
		System.out.println("과목수는 " + all2.length + "과목");

		// 4. 컴퓨터의 위치는?
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는:" + ((int) i + 1) + "번째");
			}
		}

		// 5. 과목명이 3글자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length() < 3) {// all2[i]가 String이므로 length()
				count++;
			}
		}
		System.out.println("3글자 미만 과목수는 " + count + "개");

	}

}
