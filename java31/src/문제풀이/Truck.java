package ����Ǯ��;

public class Truck extends Car {
	String height;
	
	public void breakk() {
		System.out.println("���ߴ�");
	}

	@Override
	public String toString() {
		return "Truck [height=" + height + ", color=" + color + ", design=" + design + "]";
	}
	
}
