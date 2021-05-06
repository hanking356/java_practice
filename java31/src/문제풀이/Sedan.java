package 문제풀이;

public class Sedan extends Car {
	String stable;
	
	public void soft() {
		System.out.println("부드럽다.");
	}

	@Override
	public String toString() {
		return "Sedan [stable=" + stable + ", color=" + color + ", design=" + design + "]";
	}
	
}
