package Ŭ��������;

public class ī�信�������� {

	public static void main(String[] args) {
		int coffeePrice = 4600;
		int juicePrice = 4000;
		
		int coffeeCount = 5;//Ŀ���ֹ���
		int juiceCount = 3;//�ֽ� �ֹ���
		
		//��ü �� ���� �ֹ��������?
		���� cal = new ����();
		cal.add(coffeeCount, juiceCount);
		//�޼��带 ����Ҷ� => �޼��� ȣ��(call, ��) �Ҷ�!
		//�޼��带 ����Ҷ� �� ó��������� ������ �ͼ�
		//�ٽ� ����ؾ� �ϴ� ��찡 ����.
		//������ �޾ƿ´�!��� ��. return!
		
		//Ŀ�ǰ��� ���ϱ��?
		int coffee = cal.mul(coffeeCount, coffeePrice);//23000
		//Ŀ�ǰ��� ���ϱ��?
		int juice = cal.mul(juiceCount, juicePrice);//12000
		//��ü ���� ���ϱ��?
		
		cal.add(coffee, juice);
		int hour = cal.getHour();
		System.out.println("���� �ð���" + hour);
		//���⿡ Ŀ�� ���� �ֽ����� �Է°����� �ָ鼭 ���ش޶�� ��
		
		
	}	

}
