package com.hanbin.facade;

public class Screen implements Operate {

	@Override
	public void on() {
		System.out.println("屏幕打开了");

	}

	@Override
	public void off() {
		System.out.println("屏幕关闭了");
	}

}
