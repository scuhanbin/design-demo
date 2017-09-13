package com.hanbin.adapter;

import org.junit.Test;

public class TestAdapter {
	/**
	 * ���������ģʽ��������ʵ�ֱ�����ӿ�Source���̳�Ҫ�������Target������д�ķ����е���Target�ķ���
	 */
	@Test
	public void testClassAdapter() {
		new ClassAdapter().toExecute();
	}

	/**
	 * �����������ģʽ��������ʵ�ֱ�����ӿ�Source��������д�ķ�����Target��һ��ʵ�������䷽��
	 */
	@Test
	public void testObjectAdapter() {
		new ObjectAdapter(new Target()).toExecute();
	}
}
