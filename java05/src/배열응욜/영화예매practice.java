package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ȭ����practice {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 750);
		//���帣���� ������� ��ġ�� ���ִ� ��ǰ �ʿ�
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[200];//�迭 Ŭ���� ���?
		
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton();
			b.setText(i + "");//JButton Ŭ������ setText()�޼��� ���
			f.add(b); //JFrame Ŭ������ add()�ż��带 ���
			b.setBackground(Color.yellow);//Color Ŭ������ �ִ� ������� ���,��ü ���� ���� ��� ���� 
			
			b.addActionListener(new ActionListener() {//ActionListener Ŭ���� Ȱ��, ��ü ������ ���� ���ص� ��?(�߻�޼ҵ尡 �ϳ����̶� �����Ŭ������ �����.)
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("��ư�� ��������!");
					b.setBackground(Color.red);
					System.out.println("�¼���ȣ��" + b.getText());//"100"
					//�¼���ȣ�� seat�迭�� index����! =>int
					int index = Integer.parseInt(b.getText());//100
					//�迭�� �� index�� �� 0�� ���: ���Ű� �ȵ� ��Ȳ�̶�� ����
					//�迭�� �� index�� �� 1ȣ ������ ���: ���Ű� �� ��Ȳ�̶�� ����
					seat[index] = 1; //seat[100] = 1;
					b.setEnabled(false);//Ŭ������� ����
				}
			});	
		}
		  JButton b2 = new JButton();
	      b2.setText("�����ϱ�");
	      f.add(b2);
	      b2.setBackground(Color.yellow);
	      
	      b2.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	  //seat�迭�� �ִ� �� �ϳ��� ������ �ͼ�, �� ���� 1�� ��� 
	             int count = 0;
	             for (int i = 0; i < seat.length; i++) {
	                if (seat[i] == 1) {
	                   //���ŵ� �ڸ��Դϴٶ�� ����Ʈ!
	                   System.out.println(i + ">> ���ŵ� �ڸ��Դϴ�.");
	                   //ī��Ʈ!
	                   count++;
	                   //�����ݾ�!
	                   System.out.println("�����ݾ���  " + count * 10000 + "��");
	                }
	             }
	             
	         }
	      });
	      
		
		
		f.setVisible(true);
	}

}
