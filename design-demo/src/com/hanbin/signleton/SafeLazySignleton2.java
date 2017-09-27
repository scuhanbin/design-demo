package com.hanbin.signleton;

/**
 * 线程安全的懒汉式单例：同步代码块
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
