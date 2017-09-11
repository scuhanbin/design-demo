package com.hanbin.signleton;

import org.junit.Test;

public class TestSignleton {
	@Test
	public void test() {
		HungrySignleton hungrySignleton = HungrySignleton.getInstance();
		hungrySignleton.sayHello();

		LazySignleton lazySignleton = LazySignleton.getInstance();
		lazySignleton.sayHello();

		SafeLazySignleton1 safeLazySignleton1 = SafeLazySignleton1.getInstance();
		safeLazySignleton1.sayHello();

		SafeLazySignleton2 safeLazySignleton2 = SafeLazySignleton2.getInstance();
		safeLazySignleton2.sayHello();

		SafeLazySignleton3 safeLazySignleton3 = SafeLazySignleton3.getInstance();
		safeLazySignleton3.sayHello();

		SafeLazySignleton4 safeLazySignleton4 = SafeLazySignleton4.instance;
		safeLazySignleton4.sayHello();
	}
}
