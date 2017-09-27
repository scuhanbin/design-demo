package com.hanbin.observer;

public interface Subject {
	// 添加订阅者
	void add(Observer observer);

	// 移除订阅者
	void del(Observer observer);

	// 发布新的文章
	void operation(String text);

	// 推送给所有订阅者
	void notifyAll(String text);
}
