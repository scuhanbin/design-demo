package com.hanbin.observer;

public class Observer1 implements Observer {

	@Override
	public void update(String text) {
		System.out.println("Observer1�յ��˸��£�" + text);
	}

}
