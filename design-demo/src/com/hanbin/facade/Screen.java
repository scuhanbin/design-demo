package com.hanbin.facade;

public class Screen implements Operate {

	@Override
	public void on() {
		System.out.println("��Ļ������");

	}

	@Override
	public void off() {
		System.out.println("��Ļ�ر���");
	}

}
