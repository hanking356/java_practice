package 클래스사용;

import 클래스만들기.MemberDAO;

public class dao사용 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		System.out.println(dao);
		
		dao.create("id", "1234", "abc");
		
		dao.delete("root");

	}

}
