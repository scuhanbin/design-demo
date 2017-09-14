package com.hanbin.proxy;

import org.junit.Test;

public class ProxyTest {
	/**
	 * ��̬�������������������ʵ��ͬһ���ӿڣ��������ഫ��һ������������� ��������д�ķ������ñ�������Ķ�����ñ�������ķ���
	 */
	@Test
	public void testStaticProxy() {
		new StaticProxy(new PlusCaculate()).caculate(5, 3);
		new StaticProxy(new MinusCaculate()).caculate(5, 3);
	}

	/**
	 * ��̬����
	 */
	@Test
	public void testDynamicProxy() {
		new DynamicProxy(new PlusCaculate()).getCaculate().caculate(5, 3);
		new DynamicProxy(new MinusCaculate()).getCaculate().caculate(5, 3);
	}
}
