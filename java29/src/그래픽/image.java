package �׷���;

public class image extends Thread {

	@Override
	public void run() {
		String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("�̹���:" + list[i]);
			try {
				//�ʸ� ���� �� ���� �и�������, 1/1000����.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//���ͷ�Ʈ(����, �ߴ�) : esc, ctrl + c, power-off
				e.printStackTrace();
			}
		}
	}
	
}
