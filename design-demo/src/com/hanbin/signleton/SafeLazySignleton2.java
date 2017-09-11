package com.hanbin.signleton;

/**
 * �̰߳�ȫ������ʽ������ͬ�������
 */
public class SafeLazySignleton2 {
	private static SafeLazySignleton2 signleton = null;

	private SafeLazySignleton2() {
	}

	public static SafeLazySignleton2 getInstance() {
		if (signleton == null) {
			synchronized (SafeLazySignleton2.class) {
				if (signleton == null) {
					signleton = new SafeLazySignleton2();
				}
			}
		}
		return signleton;
	}

	public void sayHello() {
		System.out.println("[SafeLazySignleton2]Hello");
	}
}
