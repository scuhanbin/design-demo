package com.hanbin.observer;

public class Observer2 implements Observer {

	@Override
	public void update(String text) {
		System.out.println("Observer2�յ��˸��£�" + text);
	}

}