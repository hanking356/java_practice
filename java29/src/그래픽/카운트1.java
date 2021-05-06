package 그래픽;

public class 카운트1 extends Thread {
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println("count:" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//인터럽트(방해, 중단) : esc, ctrl + c, power-off
				e.printStackTrace();
			}
		}
	}
}
