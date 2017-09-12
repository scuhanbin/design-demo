package com.hanbin.factorymethod;

import org.junit.Test;

public class TestFactoryMethod {
	@Test
	public void test() {
		new EmailSenderFactory().createSender().send();
		new SmsSenderFactory().createSender().send();
	}
}
