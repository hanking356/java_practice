package �׷���;

import java.util.Date;

public class day extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println("��¥:" + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//���ͷ�Ʈ(����, �ߴ�) : esc, ctrl + c, power-off
				e.printStackTrace();
			}
		}
	}
}
