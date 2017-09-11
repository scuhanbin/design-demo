package com.hanbin.signleton;

public class SafeLazySignleton3 {
	private SafeLazySignleton3() {
	}

	private static class LazyHonder {
		private static final SafeLazySignleton3 LAZY_SIGNLETON = new SafeLazySignleton3();
	}

	public static SafeLazySignleton3 getInstance() {
		return LazyHonder.LAZY_SIGNLETON;
	}

	public void sayHello() {
		System.out.println("[SafeLazySignleton3]Hello");
	}
}
