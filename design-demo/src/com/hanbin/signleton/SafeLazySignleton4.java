package com.hanbin.signleton;

/**
 * 推荐使用(简洁、易用)
 */
enum SafeLazySignleton4 {
	instance;

	public void sayHello() {
		System.out.println("[SafeLazySignleton4]Hello");
	}
}
