package com.hanbin.factorymethod;

public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("ͨ�����ŷ�����Ϣ������");
	}
}
