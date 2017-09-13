package com.hanbin.template;

public class PlusService extends AbstractCaculatorService {
	@Override
	protected void caculator(int a, int b) {
		System.out.println(a + b);
	}
}
