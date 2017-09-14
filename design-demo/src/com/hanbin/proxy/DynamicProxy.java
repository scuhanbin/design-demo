package com.hanbin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	private Caculate caculate;

	public DynamicProxy(Caculate caculate) {
		super();
		this.caculate = caculate;
	}

	public Caculate getCaculate() {
		ClassLoader loader = caculate.getClass().getClassLoader();
		Class<?>[] interfaces = caculate.getClass().getInterfaces();

		InvocationHandler h = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				before();
				return method.invoke(caculate, args);
			}
		};

		return (Caculate) Proxy.newProxyInstance(loader, interfaces, h);
	}

	private void before() {
		System.out.println("方法被调用前");
	}
}
