package �׷���;

public class ī��Ʈ1 extends Thread {
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println("count:" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//���ͷ�Ʈ(����, �ߴ�) : esc, ctrl + c, power-off
				e.printStackTrace();
			}
		}
	}
}
