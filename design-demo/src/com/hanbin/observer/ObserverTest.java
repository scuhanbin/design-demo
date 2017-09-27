package com.hanbin.observer;

/**
 * 观察者模式实例：公众号Subject，观察者Observer
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new MySubject();

		subject.add(new Observer1());
		subject.add(new Observer2());

		subject.operation("设计模式之观察者模式");
	}

}
