package �׷���;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ThreadGraphic extends JFrame{
   JLabel count, image, day;
   
   public ThreadGraphic() { //������ �޼���
      getContentPane().setBackground(Color.GREEN);
      setSize(800, 300);
      
      count = new JLabel("count");
      count.setFont(new Font("Dialog", Font.BOLD, 55));
      getContentPane().add(count, BorderLayout.WEST);
      
      image = new JLabel();
      getContentPane().add(image, BorderLayout.CENTER);
 
            
      day = new JLabel("day");
      day.setFont(new Font("Dialog", Font.BOLD, 40));
      getContentPane().add(day, BorderLayout.SOUTH);    
      
      //Count thread
      Count2 c = new Count2();
      c.start();
      
      Day2 d = new Day2();
      d.start();
      	
      Image i = new Image();
      i.start();
      
      setVisible(true);
   }
   public static void main(String[] args) {
      ThreadGraphic t = new ThreadGraphic();
   } //main

   //Ŭ�����ȿ� ���������� �����ϴ� �������� ���ο� ���� �ִ� Ŭ����: ���� Ŭ����
   //inner class, ����Ŭ����
   //����Ŭ������ ���������� �� �� ����.@Override
   public class Day2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			day.setText("��¥:" + date);			
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
			String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};
			for (int i = 0; i < list.length; i++) {
		
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					//�ʸ� ���� �� ���� �и�������, 1/1000����.
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					//���ͷ�Ʈ(����, �ߴ�) : esc, ctrl + c, power-off
					e.printStackTrace();
				}
			}
		}
		
	}
   public class Count2 extends Thread {
      @Override
      public void run(){
         for (int i = 500; i >= 0; i--) {
            count.setText("count : " + i);
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               //���ͷ�Ʈ(����, �ߴ�) : esc, ctrl+c, power-off
            }//catch
         }//for
      }//run
   } //inner class
} //class