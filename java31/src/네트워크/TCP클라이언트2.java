package ��Ʈ��ũ;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPŬ���̾�Ʈ2 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8500);
		System.out.println("Ŭ���̾�Ʈ�� 9000��Ʈ ������ ������ ��û��.");
	}

}
