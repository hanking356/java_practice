package Ŭ���������;

public class ���� {
	public String name;
	public String sort;
	public int cost;
	
	public void in(String name, String sort, int cost) {
		System.out.println("�̸���" + name);
		System.out.println("����������" + sort);
		System.out.println("�ݾ���" + cost);
		
	}
	public void in(String name, int cost) {
		System.out.println("�̸���" + name);
		System.out.println("�ݾ���" + cost);
		
	}
	public void out(int cost) {
		System.out.println("�̸���" + name);
		System.out.println("�ݾ���" + cost);
		
	}
	@Override
	public String toString() {
		return "���� [name=" + name + ", sort=" + sort + ", cost=" + cost + "]";
	}
	
	
}
