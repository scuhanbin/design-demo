package com.hanbin.signleton;

/**
 * 懒汉式单例(线程不安全)：第一次获取实例时创建对象
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
