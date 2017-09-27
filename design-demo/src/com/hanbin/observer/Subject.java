package com.hanbin.observer;

public interface Subject {
	// ��Ӷ�����
	void add(Observer observer);

	// �Ƴ�������
	void del(Observer observer);

	// �����µ�����
	void operation(String text);

	// ���͸����ж�����
	void notifyAll(String text);
}
