package com.hanbin.proxy;

public class PlusCaculate implements Caculate {
	@Override
	public void caculate(int i, int j) {
		System.out.println(i + j);
	}
}
