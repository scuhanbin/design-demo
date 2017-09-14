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
		System.out.println("开启电脑");
		host.on();
		screen.on();
		System.out.println("开启完毕");
	}

	@Override
	public void off() {
		System.out.println("关闭电脑");
		host.off();
		screen.off();
		System.out.println("关闭完毕");
	}

}
