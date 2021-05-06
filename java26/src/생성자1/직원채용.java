package 생성자1;

public class 직원채용 {

	public static void main(String[] args) {
		직원 com = new 직원("홍길동", "남", 25);
		직원 com1 = new 직원("김길동", "여", 26);
		직원 com2 = new 직원("송길동", "남", 27);
		System.out.println(com);
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(직원.count + "명");
		//System.out.println(직원.total/(double)직원.count + "명");	
		//com.getAvg();
		직원.getAvg();
	}

}
