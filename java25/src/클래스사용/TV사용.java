package Ŭ�������;

import Ŭ���������.TV;

public class TV��� {

	public static void main(String[] args) {
		//���콺 �÷��� import
		//�ڵ��ϼ�
		//��Ʈ��+����Ʈ+o(��)
		TV myTv = new TV();
		//yourTv.on();//�������� ���� yourTv������ ����ؼ� error!
		myTv.ch = 7;
		myTv.vol =9;
		myTv.onOFF = true;
		System.out.println(myTv);
		
		TV yourTv = new TV();
		//yourTv.on();//�������� ���� yourTv������ ����ؼ� error!
		yourTv.ch = 9;
		yourTv.vol =12;
		yourTv.onOFF = true;
		System.out.println(yourTv);
		
	}

}
