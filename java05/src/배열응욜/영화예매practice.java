package 배열응욜;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매practice {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 750);
		//물흐르듯이 순서대로 배치를 해주는 부품 필요
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int[] seat = new int[200];//배열 클래스 사용?
		
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton();
			b.setText(i + "");//JButton 클래스의 setText()메서드 사용
			f.add(b); //JFrame 클래스의 add()매서드를 사용
			b.setBackground(Color.yellow);//Color 클래스에 있는 노란색을 사용,객체 생성 없이 사용 가능 
			
			b.addActionListener(new ActionListener() {//ActionListener 클래스 활용, 객체 생성은 따로 안해도 됨?(추상메소드가 하나뿐이라 어댑터클래스가 없어요.)
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("버튼을 눌렀군요!");
					b.setBackground(Color.red);
					System.out.println("좌석번호는" + b.getText());//"100"
					//좌석번호가 seat배열의 index역할! =>int
					int index = Integer.parseInt(b.getText());//100
					//배열의 각 index의 값 0인 경우: 예매가 안된 상황이라고 가정
					//배열의 각 index의 값 1호 변경한 경우: 예매가 된 상황이라고 가정
					seat[index] = 1; //seat[100] = 1;
					b.setEnabled(false);//클릭기능을 막음
				}
			});	
		}
		  JButton b2 = new JButton();
	      b2.setText("결제하기");
	      f.add(b2);
	      b2.setBackground(Color.yellow);
	      
	      b2.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	  //seat배열에 있는 값 하나씩 가지고 와서, 각 값이 1인 경우 
	             int count = 0;
	             for (int i = 0; i < seat.length; i++) {
	                if (seat[i] == 1) {
	                   //예매된 자리입니다라고 프린트!
	                   System.out.println(i + ">> 예매된 자리입니다.");
	                   //카운트!
	                   count++;
	                   //결제금액!
	                   System.out.println("결제금액은  " + count * 10000 + "원");
	                }
	             }
	             
	         }
	      });
	      
		
		
		f.setVisible(true);
	}

}
