package 문제풀이;

public class Truck extends Car {
	String height;
	
	public void breakk() {
		System.out.println("멈추다");
	}

	@Override
	public String toString() {
		return "Truck [height=" + height + ", color=" + color + ", design=" + design + "]";
	}
	
}
