package com.hanbin.strategy;

/**
 * 环境类(Context):维护一个对Strategy对象的引用。
 */
public class PersonContext {
	private TravelStrategy travelStrategy;

	public PersonContext(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}

	public void travel() {
		travelStrategy.travel();
	}
}
