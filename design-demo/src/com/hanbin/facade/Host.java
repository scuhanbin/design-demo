package com.hanbin.facade;

public class Host implements Operate {

	@Override
	public void on() {
		System.out.println("����������");
	}

	@Override
	public void off() {
		System.out.println("�����ر���");
	}

}
