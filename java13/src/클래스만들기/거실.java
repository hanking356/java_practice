package Ŭ���������;

public class �Ž� {

	public static void main(String[] args) {
		//int x = 100;
		//Ÿ�� ������ = ��;
		//Ŭ�������� ������ Ÿ������ ����� �� �ִ�.
		//Ŭ������ ������(��ü�� �̸�) = new Ŭ������();
		TV tv1 = new TV();
		TV tv2 = new TV();
		PUP pup1 = new PUP();
		PUP pup2 = new PUP();
		//tv1, tv2 ��ü�� ��������� ���� ����Ǿ�� �Ѵ�.
		//tv1, tv2 ��ü�� ��������� ������ ������ �ʿ�.
		//new�Ҷ�, ��������� ����ȴ�.
		tv1.color = "������";//�迭�� �Ȱ���
		tv1.size = 50;
		
		
		tv2.color = "������";
		tv2.size = 42;
		
		System.out.println(tv1.color);
		System.out.println(tv2.size);
		System.out.println(tv1.color);
		System.out.println(tv2.size);
		tv1.on();
		tv2.off();
		
		tv2.ch();
		
		
		
		pup1.bark();
		pup2.bark();
		
	}

}
