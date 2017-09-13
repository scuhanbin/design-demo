package com.hanbin.template;

import org.junit.Test;

public class TestCaculator {
	@Test
	public void test() {
		AbstractCaculatorService plusService = new PlusService();
		plusService.caculator("5+10", "\\+");

		AbstractCaculatorService minusService = new MinusService();
		minusService.caculator("200-40", "\\-");
	}
}
