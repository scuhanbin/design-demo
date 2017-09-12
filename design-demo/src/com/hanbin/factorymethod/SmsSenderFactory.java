package com.hanbin.factorymethod;

public class SmsSenderFactory implements SenderFactory {
	@Override
	public Sender createSender() {
		return new SmsSender();
	}
}
