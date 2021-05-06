package 배열확인문제;

public class 성적변동확인 {

	public static void main(String[] args) {
		String[] title = {"국어", "수학", "영어", "과학", "컴퓨터"};
		int[] term1 = {100, 90, 70, 30, 50};
		//1학기, 2학기 점수 목록이 별도로 있어야 하기 때문에 깊은 복사! 필요
		int[] term2 = term1.clone();
		term2[3] = 55;
		term2[4] = 77;
		
		System.out.println("1학기성적");
		for (int i : term1) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n-------------------------");
		System.out.println("2학기성적");
		for (int i : term2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n-------------------------");
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i] ) {
				count++;
			}
		}
		System.out.println("더 향상된 과목수:" + count + "개");
	
	}

}
