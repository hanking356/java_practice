package 네트워크;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP서버2 {

	public static void main(String[] args) throws Exception {
		//클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		int count = 0;
		while (true) {			
			Socket socket = server.accept();//양쪽으로 전화기가 연결
			count ++;
			System.out.println("서버가" + count + "개의 클라이언트의 요청을 승인함.");
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			Date date = new Date();			
			out.print(date);
			out.close();
			socket.close();
		}
	}

}
