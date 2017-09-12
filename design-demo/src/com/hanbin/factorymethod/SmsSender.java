package com.hanbin.factorymethod;

public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("通过短信发送消息。。。");
	}
}
