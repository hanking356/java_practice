package 문제풀이;

public class Main1 {

	public static void main(String[] args) {
		Truck t = new Truck();
		Sedan s = new Sedan();
		t.color =  "green";
		t.design = "round";
		t.height = "high";
		
		s.color =  "blue";
		s.design = "sharp";
		s.stable = "good";
		
		System.out.println(t);
		System.out.println(s);
		s.fly();
		s.speed();
		s.soft();
		
		t.fly();
		t.speed();
		t.breakk();
		
	}

}
