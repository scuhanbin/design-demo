package com.hanbin.signleton;

/**
 * 饿汉式单例(线程安全)
 *
 */
public class HungrySignleton {
	private static final HungrySignleton SIGNLETON = new HungrySignleton();

	private HungrySignleton() {
	}

	public static HungrySignleton getInstance() {
		return SIGNLETON;
	}

	public void sayHello() {
		System.out.println("[HungrySignleton]Hello");
	}
}
