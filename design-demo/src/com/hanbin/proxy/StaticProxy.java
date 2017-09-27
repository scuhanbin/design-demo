package com.hanbin.proxy;

public class StaticProxy implements Caculate {
	private Caculate caculate;

	public StaticProxy(Caculate Caculate) {
		this.caculate = Caculate;
	}

	@Override
	public void caculate(int i, int j) {
		before();
		caculate.caculate(i, j);
	}

	private void before() {
		System.out.println("方法执行之前。。。。");
	}
}
