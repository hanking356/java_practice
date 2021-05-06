package 배열;

public class 정수배열 {

	public static void main(String[] args) {
		int[] num = new int[5];
			for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
		}
		System.out.println(num[0] + num[2]);
		
		String[] str = new String[3];
			str [0] ="자바";
			str [1] ="스프링";
			str [2] ="JSP";
		System.out.println(str[0] + "보다는" + str [2]);
		
		String total = "자바,스프링,JSP";
		String[] result = total.split(",");
		for (int i = 0; i < result.length; i++) {
			str[i] = result[i];
		}
		System.out.println(str[0] + "보다는" + str[2]);

	}

}
