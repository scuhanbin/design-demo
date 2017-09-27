package com.hanbin.adapter;

import org.junit.Test;

public class TestAdapter {
	/**
	 * 类的适配器模式：适配器实现被适配接口Source，继承要适配的类Target，在重写的方法中调用Target的方法
	 */
	@Test
	public void testClassAdapter() {
		new ClassAdapter().toExecute();
	}

	/**
	 * 对象的适配器模式：适配器实现被适配接口Source，在重写的方法中用Target的一个实例调用其方法
	 */
	@Test
	public void testObjectAdapter() {
		new ObjectAdapter(new Target()).toExecute();
	}
}
