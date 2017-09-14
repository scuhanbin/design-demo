package com.hanbin.proxy;

public class MinusCaculate implements Caculate {
	@Override
	public void caculate(int i, int j) {
		System.out.println(i - j);
	}
}
