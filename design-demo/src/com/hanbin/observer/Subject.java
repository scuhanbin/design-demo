package com.hanbin.observer;

public interface Subject {
	// 添加订阅者
	void add(Observer observer);

	// 删除订阅者
	void del(Observer observer);

	// 公众号更新
	void operation(String text);

	// 通知所有订阅者
	void notifyAll(String text);
}
