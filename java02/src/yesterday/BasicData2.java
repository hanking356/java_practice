package yesterday;

public class BasicData2 {
	public static void main(String[] args) {
		int phy = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		
		int sum = phy + math + eng + kor;
		double ave = (phy + math + eng + kor)/4;
		//�ڹٴ� int�� int����� ����� �׻� int!
		System.out.println("������:" + sum + " �����:" + ave);
		
		final double PI = 3.14; //���� �Ұ����� ��, ���
		double rad = 2.2;
		double area = PI * Math.pow(rad, 2);
		System.out.println("�� ������:" + area);
		
		//�ڹٴ� �ϳ��� double�̸� ������ ����� �׻� double!
		double avg = (double)sum/4;
		System.out.println("�����" + avg + "��");
		//������ Ÿ���� ���� ���ϴ� Ÿ������ �������ִ� ���� ĳ����!
		//ram���� ���� Ÿ���� �״�� �ְ�, cpu�� ram�� ����ִ� �����͸� �����ٰ� ���� ĳ����
		//(�����ϰ��� �ϴ� Ÿ�Ը�)���� => (double)sum
	} 
}
