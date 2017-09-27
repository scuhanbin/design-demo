package com.hanbin.proxy;

import org.junit.Test;

public class ProxyTest {
	/**
	 * 静态代理：代理类跟被代理类实现同一个接口，给代理类传入一个被代理类对象， 代理类重写的方法中用被代理类的对象调用被代理类的方法
	 */
	@Test
	public void testStaticProxy() {
		new StaticProxy(new PlusCaculate()).caculate(5, 3);
		new StaticProxy(new MinusCaculate()).caculate(5, 3);
	}

	/**
	 * 动态代理
	 */
	@Test
	public void testDynamicProxy() {
		new DynamicProxy(new PlusCaculate()).getCaculate().caculate(5, 3);
		new DynamicProxy(new MinusCaculate()).getCaculate().caculate(5, 3);
	}
}
