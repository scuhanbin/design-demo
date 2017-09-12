package com.hanbin.factorymethod;

public class EmailSenderFactory implements SenderFactory {
	@Override
	public Sender createSender() {
		return new EmailSender();
	}
}
