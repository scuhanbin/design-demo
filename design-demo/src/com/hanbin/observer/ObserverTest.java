package com.hanbin.observer;

/**
 * �۲���ģʽʵ�������ں�Subject���۲���Observer
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new MySubject();

		subject.add(new Observer1());
		subject.add(new Observer2());

		subject.operation("���ģʽ֮�۲���ģʽ");
	}

}
