package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ȭ���� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 750);
		// �� �帣���� ������� ��ġ�� ���ִ� ��ǰ �ʿ�
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		int[] seat = new int[200];// {0,0,0,0,0...args.}

		for (int i = 0; i < 200; i++) {

			JButton b = new JButton();
			b.setText(i + "");
			f.add(b);
			b.setBackground(Color.yellow);
			
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("��ư�� ��������.");
					b.setBackground(Color.red);
					System.out.println("�¼���ȣ��" + b.getText());//"100"
					// �¼���ȣ�� seat�迭�� index����! => int
					int index = Integer.parseInt(b.getText());//100
					// �迭�� �� index�� �� 0�� ���: ���Ű� �ȵ� ��Ȳ�̶�� ����
					// �迭�� �� index�� �� 1�� ������ ���: ���Ű� �� ��Ȳ�̶�� ����

					seat[index] = 1;// seat[100] = 1;
					b.setEnabled(false);// Ŭ������� ����.
				}

			});

			f.setVisible(true);

		}

	}
}

