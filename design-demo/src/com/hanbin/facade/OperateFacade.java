package com.hanbin.facade;

public class OperateFacade implements Operate {
	private Host host;
	private Screen screen;

	public OperateFacade(Host host, Screen screen) {
		super();
		this.host = host;
		this.screen = screen;
	}

	@Override
	public void on() {
		System.out.println("��������");
		host.on();
		screen.on();
		System.out.println("�������");
	}

	@Override
	public void off() {
		System.out.println("�رյ���");
		host.off();
		screen.off();
		System.out.println("�ر����");
	}

}
