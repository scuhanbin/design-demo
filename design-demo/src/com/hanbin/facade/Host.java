package com.hanbin.facade;

public class Host implements Operate {

	@Override
	public void on() {
		System.out.println("主机启动了");
	}

	@Override
	public void off() {
		System.out.println("主机关闭了");
	}

}
