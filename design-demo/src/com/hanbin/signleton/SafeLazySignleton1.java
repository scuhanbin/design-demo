package com.hanbin.signleton;

/**
 * 安全的懒汉式单例（同步获取实例的方法） 缺点：效率低
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
