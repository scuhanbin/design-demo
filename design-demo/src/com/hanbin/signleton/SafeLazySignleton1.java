package com.hanbin.signleton;

/**
 * ��ȫ������ʽ������ͬ����ȡʵ���ķ����� ȱ�㣺Ч�ʵ�
 */
public class SafeLazySignleton1 {
	private static SafeLazySignleton1 signleton = null;

	private SafeLazySignleton1() {
	}

	public synchronized static SafeLazySignleton1 getInstance() {
		if (signleton == null) {
			signleton = new SafeLazySignleton1();
		}
		return signleton;
	}

	public void sayHello() {
		System.out.println("[SafeLazySignleton1]Hello");
	}
}
