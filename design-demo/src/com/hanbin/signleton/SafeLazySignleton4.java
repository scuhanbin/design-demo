package com.hanbin.signleton;

/**
 * 线程安全的内部类：枚举（推荐使用）
 */
enum SafeLazySignleton4 {
	instance;

	public void sayHello() {
		System.out.println("[SafeLazySignleton4]Hello");
	}
}
