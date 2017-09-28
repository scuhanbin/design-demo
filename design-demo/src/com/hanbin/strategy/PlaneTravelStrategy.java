package com.hanbin.strategy;

public class PlaneTravelStrategy implements TravelStrategy {

	@Override
	public void travel() {
		System.out.println("坐飞机旅游...");
	}
}
