package 다른패키지;

import 상속.Employee;
import 상속.Manager;

public class 회사2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "홍길동";
//		e.address = "강남구";
//		e.salary = 300;
		//e.rrn = 20000201;
		System.out.println(e);
		
		Manager m = new Manager();
		e.name = "김길동";
//		e.address = "영등포구";
//		e.salary = 500;
		//e.rrn = 19980201;
		//m.bonus =100 사용 불가능
		System.out.println(m);
		m.test();
		
	}
}
