package com.hanbin.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation(String text) {
		System.out.println("更新了文章：" + text);

		notifyAll(text);
	}

}
