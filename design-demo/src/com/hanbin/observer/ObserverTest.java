package com.hanbin.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new MySubject();

		subject.add(new Observer1());
		subject.add(new Observer2());

		subject.operation("设计模式之观察者模式");
	}

}
