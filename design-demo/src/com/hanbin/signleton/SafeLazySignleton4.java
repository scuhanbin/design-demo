package com.hanbin.signleton;

/**
 * �Ƽ�ʹ��(��ࡢ����)
 */
enum SafeLazySignleton4 {
	instance;

	public void sayHello() {
		System.out.println("[SafeLazySignleton4]Hello");
	}
}
