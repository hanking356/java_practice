package Ŭ�������;

import Ŭ���������.MemberDAO;

public class dao��� {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		System.out.println(dao);
		
		dao.create("id", "1234", "abc");
		
		dao.delete("root");

	}

}
