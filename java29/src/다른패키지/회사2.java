package �ٸ���Ű��;

import ���.Employee;
import ���.Manager;

public class ȸ��2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "ȫ�浿";
//		e.address = "������";
//		e.salary = 300;
		//e.rrn = 20000201;
		System.out.println(e);
		
		Manager m = new Manager();
		e.name = "��浿";
//		e.address = "��������";
//		e.salary = 500;
		//e.rrn = 19980201;
		//m.bonus =100 ��� �Ұ���
		System.out.println(m);
		m.test();
		
	}
}
