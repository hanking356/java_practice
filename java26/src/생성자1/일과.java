package 생성자1;

public class 일과 {

	public static void main(String[] args) {
		Day day = new Day("자바공부",10 ,"강남");
		System.out.println(day);
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day1 = new Day("여행",15 ,"강원도");
		System.out.println(day1);
		System.out.println(Day.count);
		Day day2 = new Day("운동",10 ,"피트니스");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println(Day.sum);
		System.out.println("전체 하는 일의 시간은:" + (day.time + day1.time + day2.time) +"시간");
		System.out.println("평균 하는 일의 시간은:" + (day.time + day1.time + day2.time)/(double)3 + "시간");
		System.out.println(day.location + day.work + day.time +"시간");
		System.out.println(day1.location + day1.work + day1.time +"시간");
		System.out.println(day2.location + day2.work + day2.time +"시간");
		
	}
	

}
