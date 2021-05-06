package 조건문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 나의그래픽 {
	public static void main(String[] args) {
		JFrame f  = new JFrame();
		f.setSize(500, 500);
		
		JButton b1 = new JButton("\uBD81\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b1, BorderLayout.NORTH);
		
		JButton b2 = new JButton("\uC11C\uCABD\uBC84\uD2BC");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		f.getContentPane().add(b2, BorderLayout.WEST);
		
		JButton b3 = new JButton("\uAC00\uC6B4\uB370\uBC84\uD2BC");
		b3.setFont(new Font("굴림", Font.PLAIN, 30));
		b3.setBackground(new Color(255, 0, 0));
		b3.setForeground(Color.YELLOW);
		f.getContentPane().add(b3, BorderLayout.CENTER);
		
		JButton b4 = new JButton("\uB3D9\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b4, BorderLayout.EAST);
		
		JButton b5 = new JButton("\uB0A8\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b5, BorderLayout.SOUTH);
		f.setVisible(true);
	
		
		
		
		
		
	}
}
