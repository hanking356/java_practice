package Ŭ���������;

public class MemberDAO {
	//��������, �ڵ��ʱ�ȭ
	//������ ������ ������ null�� �ʱ�ȭ!
	//url: �������, ��������, ����������
	String url = "jdbc:mysql://localhost:3306/shop";
	String id = "root";
	String pw = "1234";
	
	//�ڹٴ� �޼��� �̸��� �Ȱ��� ���� ����
	//�޼����� ������ �Է°��� ���� �ϱ� ����!
	//�ϳ��� �̸����� �������� ������ �޼��带 �����Ͽ� ȣ���� �� �ִ� ���
	//�޼��� �����ε�(������, ����������) (�޼��� �����ε�),(�Է°��� �ٸ��ٸ� �޼��� �̸��� �����ϰ� ����Ҽ� �ִ�.)
	public void create(String id, String pw, String name) {
		System.out.println("����� �Է��� id�� "+id);
		System.out.println("����� �Է��� pw�� "+pw);
		System.out.println("����� �Է��� name�� "+name);
	}
	public void create(String id, String pw, String name, String tel) {
		System.out.println("����� �Է��� id�� "+id);
		System.out.println("����� �Է��� pw�� "+pw);
		System.out.println("����� �Է��� name�� "+name);
		System.out.println("����� �Է��� name�� "+tel);
		
	}
	@Override
	public String toString() {
		return "MemberDAO [url=" + url + ", id=" + id + ", pw=" + pw + "]";
	}
	public void delete(String id) {
	System.out.println("����� �Է��� id�� " + id);
		
	}
}