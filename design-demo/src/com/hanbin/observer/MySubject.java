package com.hanbin.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation(String text) {
		System.out.println("公众号更新文章：" + text);

		notifyAll(text);
	}

}
