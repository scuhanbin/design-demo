package com.hanbin.facade;

import org.junit.Test;

public class FacadeTest {
	/**
	 * 门面模式为一系列操作提供一个统一的入口
	 */
	@Test
	public void test() {
		OperateFacade operateFacade = new OperateFacade(new Host(), new Screen());

		operateFacade.on();
		operateFacade.off();
	}
}
