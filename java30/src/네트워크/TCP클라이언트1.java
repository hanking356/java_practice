package ��Ʈ��ũ;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPŬ���̾�Ʈ1 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 8500);
			System.out.println(i + "��: Ŭ���̾�Ʈ�� 9000��Ʈ ������ ������ ��û��.");
		}
	}

}
