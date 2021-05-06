package yesterday;

public class BasicData2 {
	public static void main(String[] args) {
		int phy = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		
		int sum = phy + math + eng + kor;
		double ave = (phy + math + eng + kor)/4;
		//자바는 int와 int계산은 결과가 항상 int!
		System.out.println("총합은:" + sum + " 평균은:" + ave);
		
		final double PI = 3.14; //변경 불가능한 값, 상수
		double rad = 2.2;
		double area = PI * Math.pow(rad, 2);
		System.out.println("원 면적은:" + area);
		
		//자바는 하나라도 double이면 무조건 결과가 항상 double!
		double avg = (double)sum/4;
		System.out.println("평균은" + avg + "점");
		//데이터 타입을 내가 원하는 타입으로 변경해주는 것을 캐스팅!
		//ram에는 원래 타입이 그대로 있고, cpu가 ram에 들어있던 데이터를 가져다가 강제 캐스팅
		//(변경하고자 하는 타입명)변수 => (double)sum
	} 
}
