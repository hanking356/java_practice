package ��Ʈ��ũ;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP���� {

	public static void main(String[] args) throws Exception {
		//Ŭ���̾�Ʈ�� ��û�� �������ֱ� ���� ����
		ServerSocket server = new ServerSocket(8500);
		System.out.println("���� ���� ���۵�");
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��...");
		int count = 0;
		while (true) {			
			Socket socket = server.accept();//�������� ��ȭ�Ⱑ ����
			count ++;
			System.out.println("������" + count + "���� Ŭ���̾�Ʈ�� ��û�� ������.");
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			String data = "I am a java programmer!!";
			out.print(data);
			out.close();
			socket.close();
		}
	}

}
