package ��Ʈ��ũ;

import java.io.IOException;
import java.net.ServerSocket;

public class TCP���� {

	public static void main(String[] args) throws Exception {
		//Ŭ���̾�Ʈ�� ��û�� �������ֱ� ���� ����
		ServerSocket server = new ServerSocket(8500);
		System.out.println("���� ���� ���۵�");
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��...");
		while (true) {			
			server.accept();
			System.out.println("������ Ŭ���̾�Ʈ�� ��û�� ������.");
		}
	}

}
