package com.hanbin.signleton;

/**
 * ����ʽ����(�̰߳�ȫ)
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
