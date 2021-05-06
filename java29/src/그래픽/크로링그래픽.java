package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크로링그래픽 extends JFrame {
	//전역 변수 , Thread 메서드까지 변수 공유  
	JLabel count, image, day;
	  
	//생성자, ThreadGraphic 메서드 객체 생성시 바로 실행하기 위해 만듦
	 public 크로링그래픽() { //생성자 메서드
	      getContentPane().setBackground(Color.PINK);
	      setSize(800, 500);
	      
	      count = new JLabel();
	      count.setFont(new Font("Dialog", Font.BOLD, 30));
	      getContentPane().add(count, BorderLayout.WEST);
	      
	      image = new JLabel();
	      getContentPane().add(image, BorderLayout.EAST);
	 	            
	      day = new JLabel("day");
	      day.setFont(new Font("Dialog", Font.BOLD, 40));
	      getContentPane().add(day, BorderLayout.SOUTH);
	      
	      Rank2 r = new Rank2();
	      r.start();
	      
	      Day2 d = new Day2();
	      d.start();
	      
	      Image2 i = new Image2();
	      i.start();
	      
	      setVisible(true);
	 }
	 
	public static void main(String[] args) throws Exception {
		크로링그래픽 t = new 크로링그래픽();		
	}
	 public class Rank2 extends Thread  {
		 public void run() { 
			 //con 객체 생성을 위해 예외처리
			 Connection con = Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.nhn");
			 try {	    	  
  				//연결한 사이트에 html문서를 받아오세요.
  				Document doc = con.get();
  				Elements anav = doc.select("div.tit3");
  					for (int i = 0; i < anav.size(); i++) {
  						count.setText (i+1 + "위:" + anav.get(i).text() + " ");
  						try {
  	  		               Thread.sleep(5000);
  	  		            } catch (InterruptedException e1) {
  	  		               //인터럽트(방해, 중단) : esc, ctrl+c, power-off
  	  		            }//catch
  					}
	      		}
	      		catch (Exception e) {
		      }               		
	         }//run
	      }//Rank2
	 
	  public class Day2 extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				day.setText("날짜:" + date);			
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						//인터럽트(방해, 중단) : esc, ctrl + c, power-off
						e.printStackTrace();
					}
				}
			}
		}
	   public class Image2 extends Thread {
			@Override
			public void run() {
				String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};
				for (int i = 0; i < list.length; i++) {			
					ImageIcon icon = new ImageIcon(list[i]);
					image.setIcon(icon);
					try {
						//초를 설정 할 때는 밀리세컨즈, 1/1000설정.
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						//인터럽트(방해, 중단) : esc, ctrl + c, power-off
						e.printStackTrace();
					}
				}
			}			
		}
	   
	  } //전체 class
					


		
			
		
	


