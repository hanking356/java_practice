package 배열응용;

public class 성적변동 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "김길동", "송길동", "박길동", "정길동"};
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		//1. 성적이 2학기에 향상된 학생의 수
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				System.out.println("2학기 향상됨.");
				count++;
			}		
		}
		System.out.println("향상된 학생 수" + count);
		
		System.out.println();
		
		//2. 성적이 동일한 학생수
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == (term2[i])) {//기본형과 주소는 ==
				System.out.println("성적 동일." + i);
				count1++;
			}
		}
		System.out.println("성적 동일 학생 수" + count1);
		
		//3. 함께 체크해보자.
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count3++;
			}else if (term1[i] < term2[i]) {
				count4++;
			} 
		}
		System.out.println("동일" + count3);
		System.out.println("향상" + count4);
	}

}
