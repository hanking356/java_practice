package ��Ʈ��ũ;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP����2 {

	public static void main(String[] args) throws Exception {
		//Ŭ���̾�Ʈ�� ��û�� �������ֱ� ���� ����
		ServerSocket server = new ServerSocket(9000);
		System.out.println("���� ���� ���۵�");
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��...");
		int count = 0;
		while (true) {			
			Socket socket = server.accept();//�������� ��ȭ�Ⱑ ����
			count ++;
			System.out.println("������" + count + "���� Ŭ���̾�Ʈ�� ��û�� ������.");
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			Date date = new Date();			
			out.print(date);
			out.close();
			socket.close();
		}
	}

}
