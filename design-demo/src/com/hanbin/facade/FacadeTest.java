package com.hanbin.facade;

import org.junit.Test;

public class FacadeTest {
	/**
	 * ����ģʽΪһϵ�в����ṩһ��ͳһ�����
	 */
	@Test
	public void test() {
		OperateFacade operateFacade = new OperateFacade(new Host(), new Screen());

		operateFacade.on();
		operateFacade.off();
	}
}
