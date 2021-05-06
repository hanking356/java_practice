package �׷���;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;


public class TreadGraphic2 extends JFrame {
	JLabel day3, count3 ,image3;
	
	
	
	public TreadGraphic2() {
		//��ü ������ �� �κ��� �ڵ� ȣ��Ǿ� ����� ������.
		getContentPane().setBackground(Color.PINK);
		 setSize(800,300);
		 
		 day3 = new JLabel("day3");
		 day3.setFont(new Font("����", Font.BOLD, 35));
		 getContentPane().add(day3, BorderLayout.SOUTH);
		 
		 count3 = new JLabel("count3");
		 count3.setFont(new Font("����", Font.BOLD, 30));
		 getContentPane().add(count3, BorderLayout.WEST);
		 
		 image3 = new JLabel("");
		 getContentPane().add(image3, BorderLayout.CENTER);
		 
		 
		 Count c = new Count(); 
		 c.start();
		 
		 Day d = new Day();
		 d.start();
		 
		 Image i = new Image();
		 i.start();
		 
		 setVisible(true);
		 
	 }
	
	public static void main(String[] args) {
		new TreadGraphic2();

}
	public class Count extends Thread {
		public void run() {
			for (int i = 500; i >= 0; i--) {
			count3.setText("count:" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					//���ͷ�Ʈ(����, �ߴ�) : esc, ctrl + c, power-off
					e.printStackTrace();
				}
			}
		}
	}
	
	public class Day extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				day3.setText("��¥��:" + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//���ͷ�Ʈ(����, �ߴ�) : esc, ctrl + c, power-off
					e.printStackTrace();
				}
			}
		}
		
	}
	public class Image extends Thread {
		@Override
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image3.setIcon(icon); 			
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

}
