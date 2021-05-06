package 문제풀이;

public class 감소 extends Thread {

	@Override
	public void run() {
		for (int i = 999; i >=0 ; i--) {
			System.out.println(i);
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
