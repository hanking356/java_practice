package ��Ʈ��ũ;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class TCPŬ���̾�Ʈ1 {

	public static void main(String[] args) throws Exception {		
		
		for (int i = 0; i < 10000; i++) {	       
			Socket socket = new Socket("localhost", 8500);
			System.out.println(i + "��: Ŭ���̾�Ʈ�� 9000��Ʈ ������ ������ ��û��.");
	         //BuffredReaderŬ������ ���ڵ��� �ٴ����� ������ �ͼ� ó���� �� �ִ� Ŭ����
	         //Reader, WriterŬ������ ���ڵ鸸 ó���ϴ� Ŭ����
	         //1.1byte������ ����.���� �������� �ν��� �ȵ� ����
//	         InputStream input = socket.getInputStream(); 
//	         //2. 1byte�� ó���Ǵ� ���� �������� �ν��� �ȵ� ���������¸� 2byte ���ڷ� �νĽ����ִ� Ŭ����
//	         InputStreamReader reader = new InputStreamReader(input);
//	         BufferedReader buffer = new BufferedReader(reader);
	         //3. 2byte������ ó���� ���ڵ��� �ٴ����� �о�� �� �ִ� Ŭ����	         
	         BufferedReader buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	         //buffer: �ӽ� ������
	         String data = buffer2.readLine();
	         System.out.println("������ ���� ���� ������ >> " + data);
	      }
	   }

	}










//			Socket socket = new Socket("localhost", 9000);
//			for (int i = 0; i < 1000; i++) {
//			System.out.println(i + "��: Ŭ���̾�Ʈ�� 9000��Ʈ ������ ������ ��û��.");
//		
//			//Reader, WriterŬ������ ���ڵ鸸 ó���ϴ� Ŭ����
//			InputStream input = socket.getInputStream();//1����Ʈ ������ �ϴ� ������ ������, ���� �������� �ν��� �ȵ� ��Ȳ
//			
//			InputStreamReader reader = new InputStreamReader(input);//�ٴ����� ���ڷθ� �νĵǹǷ� ������ ���ڷ� ��ȯ��Ű�� ��ǰ�� �ʿ�
//			BufferedReader buffer = new BufferedReader(reader);//2����Ʈ ������ ó��, BuffredReaderŬ������ ���ڵ��� �� ������ ������ �ͼ� ó���� �� �ִ� Ŭ����
//			
//			
//		}
//	}
//}
