package com.hanbin.signleton;

/**
 * ����ʽ����(�̲߳���ȫ)����һ�λ�ȡʵ��ʱ��������
 */
public class LazySignleton {
	private static LazySignleton signleton = null;

	private LazySignleton() {
	}

	public static LazySignleton getInstance() {
		if (signleton == null) {
			signleton = new LazySignleton();
		}
		return signleton;
	}

	public void sayHello() {
		System.out.println("[LazySignleton]Hello");
	}
}
