package com.hanbin.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation(String text) {
		System.out.println("���ںŸ������£�" + text);

		notifyAll(text);
	}

}
