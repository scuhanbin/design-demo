package com.hanbin.factorymethod;

public class EmailSender implements Sender {
	@Override
	public void send() {
		System.out.println("通过邮件发送消息。。。");
	}
}
